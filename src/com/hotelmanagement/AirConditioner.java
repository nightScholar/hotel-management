package com.hotelmanagement;

public class AirConditioner implements Amenities
{
    private String name;


    public AirConditioner()
    {
        this.name = "Air Conditioner";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
