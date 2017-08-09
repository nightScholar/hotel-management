package com.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class DoubleBed implements RoomType
{
    private double price;
    private int bedsInRoom;
    private Amenities amenities;
    private List<Amenities> amenitiesList;
    private static int roomNumber = 0;


    public DoubleBed()
    {
        price = 90.00;
        bedsInRoom = 2;
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
