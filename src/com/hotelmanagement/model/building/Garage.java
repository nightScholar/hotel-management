package com.hotelmanagement.model.building;

import com.hotelmanagement.model.customer.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage
{
    private String name;
    private int capacity = 70;
    private List<Vehicle> vehicleList;


    public Garage(String name)
    {
        this.name = name;
        vehicleList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public int getCapacity()
    {
        return this.capacity;
    }


    public List<Vehicle> getVehicleList()
    {
        return vehicleList;
    }
}
