package com.hotelmanagement.model.building.item;

public class CoffeeMaker implements Amenities
{
    private String name;


    public CoffeeMaker()
    {
        this.name = "Coffee Maker";
    }


    @Override
    public String getName()
    {
        return name;
    }
}
