package com.kgisl.excel;

import java.util.ArrayList;
import java.util.List;

/**
* ListString
*/
public class ListOfList {


   public static void main(String[] args) {

//using string

       List<List<String>> a=new ArrayList<List<String>>();

       List<String> b= new ArrayList<String>();
       b.add("a");
       b.add("b");
       a.add(b);
       // System.out.println(a);

       List<String> c=new ArrayList<String>();
       c.add("c");
       c.add("d");
       a.add(c);


      //b.addAll(c);
      System.out.println(a);




       // a.forEach((list)  ->
        // {
        //     list.forEach((alphabets) -> System.out.println(alphabets));
        // }
        //         );
//using integer

       // List<List<Integer>> a=new ArrayList<List<Integer>>();

       // List<Integer> b= new ArrayList<Integer>();
       // b.add(1);
       // b.add(2);
       // a.add(b);

       // List<Integer> c = new ArrayList<Integer>();
       // c.add(3);
       // c.add(4);
       // a.add(c);
       // System.out.println(a);



   }



}