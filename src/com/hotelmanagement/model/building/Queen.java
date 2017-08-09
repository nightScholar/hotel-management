package com.hotelmanagement.model.building;

import com.hotelmanagement.model.building.item.Amenities;

import java.util.ArrayList;
import java.util.List;

public class Queen implements RoomType
{
    private double price;
    private int bedsInRoom;
    private Amenities amenities;
    private List<Amenities> amenitiesList;
    private static int roomNumber = 0;


    public Queen()
    {
        price = 130.00;
        bedsInRoom = 1;
        amenitiesList = new ArrayList<>();
        roomNumber++;
    }


    @Override
    public List<Amenities> getAmenitiesList()
    {
        return null;
    }

    @Override
    public double getPrice()
    {
        return 0;
    }

    @Override
    public int getBedsInRoom()
    {
        return 0;
    }

    public static int getRoomNumber()
    {
        return roomNumber;
    }
}