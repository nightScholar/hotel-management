package com.hotelmanagement.model.building;

import com.hotelmanagement.model.building.item.*;

import java.util.ArrayList;
import java.util.List;

public class King implements RoomType
{
    private double price = 170.00;
    private int bedsInRoom = 1;
    private static int roomNumber = 0;
    private List<Amenities> amenitiesList = new ArrayList<>();

    private Amenities airConditioner = new AirConditioner();
    private Amenities coffeeMaker = new CoffeeMaker();
    private Amenities iron = new Iron();
    private Amenities lcdTV = new LcdTV();
    private Amenities microwave = new Microwave();
    private Amenities miniRefrigerator = new MiniRefrigerator();
    private Amenities wifi = new Wifi();
    private Amenities workDesk = new WorkDesk();


    public King()
    {
        roomNumber++;

        amenitiesList.add(airConditioner);
        amenitiesList.add(coffeeMaker);
        amenitiesList.add(iron);
        amenitiesList.add(lcdTV);
        amenitiesList.add(microwave);
        amenitiesList.add(miniRefrigerator);
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

    public void printAmenities()
    {
        System.out.println("Amenities: " + "\n");

        for(Amenities amenities : amenitiesList)
        {
            System.out.print(amenities.getName() + "\n");
        }
    }

}
