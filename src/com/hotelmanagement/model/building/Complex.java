package com.hotelmanagement.model.building;

import com.hotelmanagement.model.customer.Address;

import java.util.ArrayList;
import java.util.List;

public class Complex
{
    private String name;
    private Address address;
    private Building building;
    private int capacity = 10;
    private List<Building> buildingList;


    public Complex()
    {

    }

    public Complex(String name, Address address, Building building)
    {
        this.name = name;
        this.address = address;
        this.building = building;
        buildingList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }


    public Building getBuilding()
    {
        return building;
    }

    public int getCapacity()
    {
        return capacity;
    }


    public List<Building> getBuildingList()
    {
        return buildingList;
    }

    public void addBuilding(Building building)
    {
        try
        {
            if(buildingList.size() > this.capacity)
            {
                throw new IllegalStateException();
            }
            else
            {
                buildingList.add(building);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println(this.name + " Complex has reached its maximum capacity," +
                    "no more buildings can be added");
        }
    }

    public void removeBuilding(Building building)
    {
        try
        {
            if(buildingList.size() == 0)
            {
                throw new IllegalStateException();
            }
            else
            {
                buildingList.remove(building);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println(this.name + " Complex does not have any buildings to remove");
        }
    }

}
