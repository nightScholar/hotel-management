package com.hotelmanagement.model.item;

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
