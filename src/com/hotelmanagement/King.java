package com.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class King implements RoomType
{
    private double price;
    private int bedsInRoom;
    private Amenities amenities;
    private List<Amenities> amenitiesList;
    private static int roomNumber = 0;


    public King()
    {
        price = 170.00;
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
        return price;
    }

    @Override
    public int getBedsInRoom()
    {
        return bedsInRoom;
    }

    public static int getRoomNumber()
    {
        return roomNumber;
    }


}
