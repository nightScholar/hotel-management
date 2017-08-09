package com.hotelmanagement.model.building.item;

public class MiniRefrigerator implements Amenities
{
    private String name;


    public MiniRefrigerator()
    {
        this.name = "Mini Refrigerator";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
