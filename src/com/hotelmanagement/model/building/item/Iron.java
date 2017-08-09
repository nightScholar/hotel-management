package com.hotelmanagement.model.building.item;

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
