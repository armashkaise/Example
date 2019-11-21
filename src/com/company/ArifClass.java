package com.company;

public class ArifClass {

    public static void main(String[] args) {
        ArifClass arifClass = new ArifClass();
        arifClass.someMethod();
    }

    void someMethod() {
        try {
            Object o = null;
            o.toString();
            //throw new Exception();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
