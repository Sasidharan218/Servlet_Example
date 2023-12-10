package com.kgisl.qs1;

/**
 * Student
 */
public class Student 
{
    private int id;
    private String name;
    private String dept;
    private float cgpa;
    private int phone;

    Student(int id,String name, String dept,float cgpa,int phone)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.cgpa=cgpa;
        this.phone=phone;

    }




    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the cgpa
     */
    public float getCgpa() {
        return cgpa;
    }

    /**
     * @param cgpa the cgpa to set
     */
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
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
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    public String toString() 
    { 
        return id + " " + name + " " + dept + " " + cgpa + " " + phone; 
    } 
    
}