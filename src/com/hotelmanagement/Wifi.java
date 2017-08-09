package com.hotelmanagement;

public class Wifi implements Amenities
{
    private String name;


    public Wifi()
    {
        this.name = "Wifi";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
