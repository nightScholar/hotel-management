package com.hotelmanagement.model.employee;

import java.util.GregorianCalendar;
import java.util.Random;

public class FullTimeEmployee extends Employee implements Benefits
{
    private boolean isMarried;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    private Random random = new Random();
    private final Integer idNumber = random.nextInt(999);


    public FullTimeEmployee(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    public GregorianCalendar getStartDate()
    {
        return startDate;
    }

    public void setStartDate(GregorianCalendar hireDate)
    {
        this.startDate = hireDate;
    }

    public GregorianCalendar getEndDate()
    {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate)
    {
        this.endDate = endDate;
    }


    public boolean isMarried()
    {
        return isMarried;
    }

    public void setIsMarried(boolean married)
    {
        isMarried = married;
    }

    /*
    * Overridden from abstract Employee class
    * */

    @Override
    public Integer getIdNumber()
    {
        return idNumber;
    }

    /*
    * Overridden from Benefits interface
    * */

    @Override
    public boolean hasMedical()
    {
        return true;
    }

    @Override
    public boolean hasDental()
    {
        return true;
    }

    @Override
    public boolean hasVision()
    {
        return true;
    }
}
