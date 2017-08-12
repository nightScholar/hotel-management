package com.hotelmanagement.model.employee;

import com.hotelmanagement.model.building.Building;
import com.hotelmanagement.model.customer.Guest;

import java.util.*;

public class Supervisor extends FullTimeEmployee implements Benefits
{
    private String firstName;
    private String lastName;
    private boolean isMarried;
    private Building building;
    private Map<List<String>, Integer> guestRoomMap;
    private List<Employee> employeeList;

    private Random random = new Random();
    private final Integer idNumber = random.nextInt(999);


    public Supervisor(String firstName, String lastName, Building building)
    {
        super(firstName, lastName);
        this.building = building;
        guestRoomMap = new HashMap<>();
        employeeList = new ArrayList<>();
    }

    public Building getBuilding()
    {
        return building;
    }

    public void setBuilding(Building building)
    {
        this.building = building;
    }

    public Map<List<String>, Integer> getGuestRoomMap()
    {
        return guestRoomMap;
    }

    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    public void printInvoice(Guest guest)
    {

    }

    // Need to finish this method

    public void addGuestToMapList(Guest guest)
    {
        for(Map.Entry<List<String>, Integer> entry : guestRoomMap.entrySet())
        {

        }
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
