package com.kgisl.excel;

import java.util.Date;

class Company {
    private String name;
    private String email;
    private Date dateOfBirth;
    private double salary;

    public Company(String name, String email, Date date, double salary) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = date;
        this.salary = salary;
    }

	// Getters and Setters (Omitted for brevity)
}