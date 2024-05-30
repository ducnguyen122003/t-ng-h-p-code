package javabase;

import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void myMethod() {
        System.out.println("call myMethod");
    }

    public static void main(String[] args) {

        //variables
        int number = 13;
        String name = "duc";
        System.out.println(number);

        myMethod();

        //datatype
        // byte < short < int < long (number)
        /* float: Stores fractional numbers (6 to 7 decimal digits)
           double: Stores fractional numbers (15 decimal digits)
           boolean: true or false
           char:
         */
        //array...
        int[][] myNumbers = { {1, 2, 13, 24}, {5, 66, 57} };
        System.out.println(myNumbers[1][2]);

        String[] mnv = {"01", "02", "03"};
        System.out.println(mnv[1]);

        //if-else switch case

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();


        if (a < 15) {
            System.out.println("nad");
        } else if ( a > 15){
            System.out.println("123");
        }

        System.out.print("Nhập số btvn: ");
        int btvn = scanner.nextInt();

        switch (btvn){
            case 1:
                System.out.println("bai1");
                break;
            case 2:
                System.out.println("bai2");
                break;
            case 3:
                System.out.println("bai3");
                break;
        }

    }

}