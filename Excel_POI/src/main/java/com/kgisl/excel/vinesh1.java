package com.kgisl.excel;

import java.util.Scanner;

class student_data {
    int id;
    String name;
    float m1, m2, m3, total;

}

public class vinesh1 {
    public static void main(String[] args) throws NullPointerException {
        System.out.println("Enter No of Students in Class");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();

        student_data[] obj = new student_data[l];
        for (int i = 0; i < l; i++) {
            obj[i] = null;
            obj[i] = new student_data();
        }
        // obj[0] = null;
        // obj[1] = null;

        // obj[0] = new student_data();
        // obj[1] = new student_data();

        for (int i = 0; i < l; i++) {

            System.out.println("Student No = " + i);
            System.out.println("Enter Roll No");
            obj[i].id = in.nextInt();
            System.out.println("Enter Name");
            obj[i].name = in.next();
            System.out.println("Enter mark of Sub1");
            obj[i].m1 = in.nextFloat();
            System.out.println("Enter mark of Sub2");
            obj[i].m2 = in.nextFloat();
            System.out.println("Enter mark of Sub3");
            obj[i].m3 = in.nextFloat();

            obj[i].total = obj[i].m1 + obj[i].m2 + obj[i].m3;

        }
        System.out.println("Roll Name Mark1 Mark2 Mark3 Total");
        for (int i = 0; i < l; i++) {

            System.out.println("Element at " + i + " : " + obj[i].id + " " + obj[i].name + " " + obj[i].m1 + " "
                    + obj[i].m2 + " " + obj[i].m3 + " " + obj[i].total);
        }

    }
}
