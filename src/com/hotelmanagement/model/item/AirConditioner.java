package com.hotelmanagement.model.item;

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
