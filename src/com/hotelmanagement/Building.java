package com.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class Building
{
    private String name;
    private int buildingNumber;
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

    public Garage getGarage()
    {
        return garage;
    }

    public void addRoomToList(RoomType roomType)
    {
        /*
        * Need to set a condition that does not allow a Building to add more rooms
        * than what a certain roomType has allowed by their static roomNumber variable
        * */
        roomTypeList.add(roomType);
    }

    public void removeRoomFromList(RoomType roomType)
    {
        /*
        * will first need to check and make sure the total number of that room type is not zero.
        * For example, if roomNumber attribute for a specific roomType is zero, throw an exception saying
        * "there are no more rooms available.
        * */
        roomTypeList.remove(roomType);
    }



}
