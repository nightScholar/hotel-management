package com.hotelmanagement;

public class WorkDesk implements Amenities
{
    private String name;


    public WorkDesk()
    {
        this.name = "Work Desk";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
