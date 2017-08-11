package com.hotelmanagement.model.employee;

import java.util.GregorianCalendar;
import java.util.Random;

public class Contractor extends Employee
{
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    private Random random = new Random();
    private final Integer idNumber = random.nextInt(999);


    public Contractor(String firstName, String lastName)
    {
        super(firstName, lastName);
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

    @Override
    public Integer getIdNumber()
    {
        return idNumber;
    }
}
