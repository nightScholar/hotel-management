package com.hotelmanagement.model.building.item;

public class Microwave implements Amenities
{
    private String name;


    public Microwave()
    {
        this.name = "Microwave";
    }


    @Override
    public String getName()
    {
        return name;
    }
}