package com.hotelmanagement.model.building;

import com.hotelmanagement.model.building.item.*;

import java.util.ArrayList;
import java.util.List;

public class DoubleBed implements RoomType
{
    private double price = 90.00;
    private int bedsInRoom = 2;
    private List<Amenities> amenitiesList = new ArrayList<>();
    private static int roomNumber = 0;

    private Amenities airConditioner = new AirConditioner();
    private Amenities iron = new Iron();
    private Amenities lcdTV = new LcdTV();
    private Amenities wifi = new Wifi();
    private Amenities workDesk = new WorkDesk();


    public DoubleBed()
    {
        roomNumber++;

        amenitiesList.add(airConditioner);
        amenitiesList.add(iron);
        amenitiesList.add(lcdTV);
        amenitiesList.add(wifi);
        amenitiesList.add(workDesk);
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

    @Override
    public void printAmenities()
    {
        System.out.println("Amenities: " + "\n");

        for(Amenities amenities : amenitiesList)
        {
            System.out.print(amenities.getName() + "\n");
        }
    }
}
