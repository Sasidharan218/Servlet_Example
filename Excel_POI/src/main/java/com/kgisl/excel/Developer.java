package com.kgisl.excel;

import java.math.BigDecimal;

public class Developer 
{

    private String name;
    private BigDecimal salary;
    private int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.setName(name);
        this.setSalary(salary);
        this.setAge(age);
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
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
}    