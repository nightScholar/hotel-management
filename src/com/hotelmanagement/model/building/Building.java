package com.hotelmanagement.model.building;

import java.util.ArrayList;
import java.util.List;

public class Building
{
    private String name;
    private int buildingNumber;
    private int capacity = 60;
    private List<RoomType> roomTypeList;
    private Garage garage;


    public Building(String name, int buildingNumber, Garage garage)
    {
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.garage = garage;
        roomTypeList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBuildingNumber()
    {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber)
    {
        this.buildingNumber = buildingNumber;
    }

    public List<RoomType> getRoomTypeList()
    {
        return roomTypeList;
    }

    public Garage getGarage()
    {
        return garage;
    }

    public void addRoom(RoomType roomType)
    {
        try
        {
            if(roomTypeList.size() > this.capacity)
            {
                throw new IllegalStateException();
            }
            else
            {
                roomTypeList.add(roomType);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println(this.name + " Complex has reached its maximum capacity," +
                    "no more buildings can be added");
        }
    }

    public void removeRoom(RoomType roomType)
    {
        try
        {
            if(roomTypeList.size() == 0)
            {
                throw new IllegalStateException();
            }
            else
            {
                roomTypeList.remove(roomType);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println(this.name + " Complex does not have any buildings to remove");
        }
    }

}
