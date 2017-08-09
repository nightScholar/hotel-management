package com.hotelmanagement.model.building;

import com.hotelmanagement.model.building.item.Amenities;

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
