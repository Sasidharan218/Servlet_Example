package com.kgisl.excel;

/**
* Marks
*/
public class Marks {

   private int id;
   private String name;
   private String college;
   private String department;
   private int year;
   private int mark1;
   private int mark2;
   private int mark3;

   Marks() {
   }

   Marks(int id, String name, String college, String department, int year, int mark1, int mark2, int mark3) {
       this.id = id;
       this.name = name;
       this.college = college;
       this.department = department;
       this.year = year;
       this.mark1 = mark1;
       this.mark2 = mark2;
       this.mark3 = mark3;
   }

   /**
    * @return the id
    */
   public int getId() {
       return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(int id) {
       this.id = id;
   }

   /**
    * @return the name
    */
   public String getName() {
       return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
       this.name = name;
   }

   /**
    * @return the college
    */
   public String getCollege() {
       return college;
   }

   /**
    * @param college the college to set
    */
   public void setCollege(String college) {
       this.college = college;
   }

   /**
    * @return the department
    */
   public String getDepartment() {
       return department;
   }

   /**
    * @param department the department to set
    */
   public void setDepartment(String department) {
       this.department = department;
   }

   /**
    * @return the year
    */
   public int getYear() {
       return year;
   }

   /**
    * @param year the year to set
    */
   public void setYear(int year) {
       this.year = year;
   }

   /**
    * @return the mark1
    */
   public int getMark1() {
       return mark1;
   }

   /**
    * @param mark1 the mark1 to set
    */
   public void setMark1(int mark1) {
       this.mark1 = mark1;
   }

   /**
    * @return the mark2
    */
   public int getMark2() {
       return mark2;
   }

   /**
    * @param mark2 the mark2 to set
    */
   public void setMark2(int mark2) {
       this.mark2 = mark2;
   }

   /**
    * @return the mark3
    */
   public int getMark3() {
       return mark3;
   }

   /**
    * @param mark3 the mark3 to set
    */
   public void setMark3(int mark3) {
       this.mark3 = mark3;
   }

   @Override
   public String toString() {
       return id + " " + name + " " + college + " " + department + " " + year + " " + mark1 + " " + mark2 + " "
               + mark3;
   }
}