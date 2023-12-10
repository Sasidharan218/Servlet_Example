package com.kgisl.excel;

class Student3Constructor2

{

    int RollNo;

    String name;

    int m1;

    int m2;

    int m3;

    int total = m1 + m2 + m3;

    Student3Constructor2(String s, int a, int b, int c, int d)

    {

        name = s;

        m1 = a;

        m2 = b;

        m3 = c;

        total = d;

    }

    // method to display the value of id and name

    void display()

    {

        System.out.println(name + " " + m1 + " " + m2 + " " + m3 + " " + " " + total);

    }

    public static void main(String[] args)

    {

        // creating objects

        Student3Constructor2 s1 = new Student3Constructor2("vinesh", 1, 90, 90, 270);

        Student3Constructor2 s2 = new Student3Constructor2("krishna", 2, 50, 50, 50);
        // displaying values of the object

    //    for (int i = 1; i <= 2; i++)
    //    {
    //     s[i].display();
    //    }
       



    }

}