package com.company;

class MyParent{
    protected int a;
    protected int b;
    public int c;
}

class MyChild extends MyParent{
    int d;
    MyChild(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        super.c = c;
        this.d = d;
    }
}

public class VarExample {
    public static void main(String[] args) {
        MyChild myChild = new MyChild(1,2,3,4);
        System.out.println(myChild.a);
        System.out.println(myChild.b);
        System.out.println(myChild.c);
        System.out.println(myChild.d);
    }


}
