package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gc {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        List<Date> ld = method(runtime);
        ld = null;
        System.gc();
        System.out.println("total memory after gc2 " + runtime.totalMemory());
        System.out.println("free memory after gc2 " + runtime.freeMemory());
    }


private static List<Date> method(Runtime runtime){
    //    Runtime runtime = Runtime.getRuntime();
    System.out.println("total memory before " + runtime.totalMemory());
    System.out.println("free memory before " + runtime.freeMemory());
    List<Date> dataList = new ArrayList<>();
    for (int i=0; i<1000000; i++){
        Date date = new Date();
        dataList.add(date);
        //date = null;
    }
    System.out.println("total memory after " + runtime.totalMemory());
    System.out.println("free memory after " + runtime.freeMemory());
    System.gc();
    System.out.println("total memory after gc " + runtime.totalMemory());
    System.out.println("free memory after gc " + runtime.freeMemory());
    return dataList;
}

@Override
    public void finalize(){
    System.out.println("Run garbage collector");
}
}