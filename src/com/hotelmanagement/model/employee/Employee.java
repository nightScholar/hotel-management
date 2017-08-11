package com.hotelmanagement.model.employee;

import java.util.GregorianCalendar;
import java.util.Random;

public abstract class Employee
{
    private String firstName;
    private String lastName;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    private Random random = new Random();
    private final Integer idNumber = random.nextInt(999);


    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Integer getIdNumber()
    {
        return idNumber;
    }

    public GregorianCalendar getStartDate()
    {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate)
    {
        this.startDate = startDate;
    }

    public GregorianCalendar getEndDate()
    {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate)
    {
        this.endDate = endDate;
    }
}
