package com.company;

public class Q {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num ){
        while(valueSet){
            try{ wait();}catch(Exception e){}
        }
        this.num = num ;
        System.out.println("put: "+num);
        valueSet  = true;
        notify();
    }

    public synchronized void get(){
        while(!valueSet){
            try{wait();}catch(Exception e){}
        }
        System.out.println("get: "+ num);
        valueSet = false;
        notify();
    }
}
