package com.company;

public class Main {
	static int i=5;
	int j;
	static{
		System.out.println("static inicializer");
	}
	{
		System.out.println("inicializer");
	}
	Main(){
		i++;
		System.out.println("constructor");
	}
	static void method(){
		System.out.println("static method");
	}
    public static void main(String[] args) {
		Main.method();
//		System.out.println(Main.i);
		System.out.println(new Main());


    }
}
