package com.hotelmanagement.model.building.item;

public class LcdTV implements Amenities
{
    private String name;


    public LcdTV()
    {
        this.name = "LCD TV";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
