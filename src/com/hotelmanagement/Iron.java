package com.hotelmanagement;

public class Iron implements Amenities
{
    private String name;


    public Iron()
    {
        this.name = "Iron";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
