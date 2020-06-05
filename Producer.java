package com.company;

public class Producer implements Runnable{
    Q q ;
    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
            try{Thread.sleep(10);}catch(InterruptedException e){}
        }
    }
}
