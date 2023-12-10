package com.kgisl.excel;
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class Enum_Inheritance 
{ 
    public static void main(String[] args) 
    { 
        // Calling values() 
        Color arr[] = Color.values(); 
  
        // enum with loop 
        for (Color col : arr) 
        { 
            // Calling ordinal() to find index of color. 
            System.out.println(col + " at index "+ col.ordinal()); 
        } 
  
        // Using valueOf(). Returns an object of Color with given constant. 
        
        System.out.println(Color.valueOf("RED")); 
        // System.out.println(Color.valueOf("WHITE"));// Uncommenting second line causes exception IllegalArgumentException  
    } 
} 