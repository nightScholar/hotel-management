package com.hotelmanagement.model.employee;

import com.hotelmanagement.model.building.Building;
import com.hotelmanagement.model.building.RoomType;
import com.hotelmanagement.model.customer.Guest;

import java.util.Map;
import java.util.Random;

public class Supervisor extends FullTimeEmployee implements Benefits
{
    private String firstName;
    private String lastName;
    private boolean isMarried;
    private Building building;
    private Map<Guest, RoomType> guestRoomMap;

    private Random random = new Random();
    private final Integer idNumber = random.nextInt(999);


    public Supervisor(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    public Building getBuilding()
    {
        return building;
    }

    public void setBuilding(Building building)
    {
        this.building = building;
    }

    public Map<Guest, RoomType> getGuestRoomMap()
    {
        return guestRoomMap;
    }

    public void setGuestRoomMap(Map<Guest, RoomType> guestRoomMap)
    {
        this.guestRoomMap = guestRoomMap;
    }

    /*
    * Overridden from FullTimeEmployee class
    * */

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public Integer getIdNumber()
    {
        return idNumber;
    }

    @Override
    public boolean isMarried()
    {
        return isMarried;
    }

    @Override
    public void setIsMarried(boolean married)
    {
        isMarried = married;
    }

     /*
    * Overridden from Benefits interface
    * */

    @Override
    public boolean hasMedical()
    {
        return true;
    }

    @Override
    public boolean hasDental()
    {
        return true;
    }

    @Override
    public boolean hasVision()
    {
        return true;
    }


}
