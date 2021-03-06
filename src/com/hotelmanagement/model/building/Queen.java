package com.hotelmanagement.model.building;

import com.hotelmanagement.model.item.*;

import java.util.ArrayList;
import java.util.List;

public class Queen implements RoomType
{
    private double price = 130.00;
    private int bedsInRoom = 1;
    private BedType bedType = BedType.QUEEN;
    private List<Amenities> amenitiesList = new ArrayList<>();

    private Amenities airConditioner = new AirConditioner();
    private Amenities coffeeMaker = new CoffeeMaker();
    private Amenities iron = new Iron();
    private Amenities lcdTV = new LcdTV();
    private Amenities wifi = new Wifi();
    private Amenities workDesk = new WorkDesk();


    public Queen()
    {
        amenitiesList.add(airConditioner);
        amenitiesList.add(coffeeMaker);
        amenitiesList.add(iron);
        amenitiesList.add(lcdTV);
        amenitiesList.add(wifi);
        amenitiesList.add(workDesk);
    }


    @Override
    public List<Amenities> getAmenitiesList()
    {
        return amenitiesList;
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


    @Override
    public BedType getBedType()
    {
        return bedType;
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
