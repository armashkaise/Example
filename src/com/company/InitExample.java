package com.company;

class Parent{
    static {
        System.out.println("Parent static init block");
    }
    Parent(){
        System.out.println("Parent constructor");
    }
}

public class InitExample extends Parent{

    static {
        System.out.println("static init block");
    }
    {
        System.out.println("init block");
    }
    InitExample(){
//        super();
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InitExample();
    }

}
