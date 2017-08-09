package com.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class Garage
{
    private String name;
    private List<Vehicle> vehicleList;


    public Garage()
    {

    }

    public Garage(String name)
    {
        this.name = name;
        vehicleList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Vehicle> getVehicleList()
    {
        return vehicleList;
    }
}
