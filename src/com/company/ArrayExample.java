package com.company;

public class ArrayExample {
    public static void main(String[] args) {
//        Exampl1 exampl1 = new Exampl1();
//        int[][] i = exampl1.method();

        Exampl2 exampl2 = new Exampl2();
        exampl2.method();

}
}

class Exampl1{
    int[][] method(){
        int[][] i = new int[3][];
        int[] j = new int[3];
        for (int k = 0; k < j.length; k++){
            j[k] = k;
        }
        i[0]=j;
        for (int k = 0; k < i.length; k++){
            System.out.println(i[0][k]);
        }
        return i;
    }
    }

class Exampl2{
    void method() {
        int[] b = {1, 2, 3, 4};

     /*   for (int k = 0; k < b.length; k++) {
            System.out.println(b[k]);
        }*/

     for (int i : b){
         System.out.println(i);
     }
    }
}

