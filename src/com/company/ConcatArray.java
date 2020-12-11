package com.company;

import java.util.Scanner;

public class ConcatArray {

    public static void main(String[] args) {
        // write your code here
        new ConcatArray().insert();
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert array length 1");
        int sizeA = scanner.nextInt();
        int[] arrA = new int[sizeA];
        System.out.println("please insert array element");
        String outA = "";
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = scanner.nextInt();
            outA += arrA[i] + "\t";
        }
        System.out.println("please insert array length 2");
        int sizeB = scanner.nextInt();
        int[] arrB = new int[sizeB];
        System.out.println("please insert array element");
        String outB = "";
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = scanner.nextInt();
            outB += arrB[i] + "\t";
        }

        System.out.println("Array 1: " + outA + "\n" + "Array 2: " + outB);

        int[] arrC = new int[arrA.length + arrB.length];
        String outC = "";
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }
        for (int i = 0; i < arrB.length; i++) {
            arrC[arrA.length + i] = arrB[i];
        }
        for (int i = 0; i < arrC.length; i++) {
            outC +=arrC[i]+"\t";
        }
            System.out.println("the new array is:\t" + outC);
    }

}
