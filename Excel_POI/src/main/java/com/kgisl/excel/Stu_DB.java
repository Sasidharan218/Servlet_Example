package com.kgisl.excel;

/**
 * Stu_DB
 */
public class Stu_DB
{
    private int RollNo;
    private String Name;
    private String Course;
    private String Address;

    Stu_DB (int RollNo,String Name,String Course,String Address)
    {
        this.RollNo=RollNo;
        this.Name=Name;
        this.Course=Course;
        this.Address=Address;
    }


    /**
     * @return the rollNo
     */
    public int getRollNo() {
        return RollNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.Address = address;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return Course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.Course = course;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * @param rollNo the rollNo to set
     */
    public void setRollNo(int rollNo) {
        this.RollNo = rollNo;
    }

    public String toString()
    {
        return RollNo+" "+Name+" "+Course+" "+Address;
    }

    
}