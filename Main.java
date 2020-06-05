package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Q q = new Q();
        new Producer(q);
        new Costumer(q);
    }
}
