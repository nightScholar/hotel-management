package com.hotelmanagement.model.customer;

import com.hotelmanagement.model.building.Building;
import com.hotelmanagement.model.building.Garage;
import com.hotelmanagement.model.building.RoomType;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class Guest
{
    private String firstName;
    private String lastName;
    private Address address;
    private Vehicle vehicle;
    private RoomType roomType;
    private ContactInformation contactInformation;
    private List<ContactInformation> contactInformationList;

    private Random random = new Random();
    private final Integer reservationId = random.nextInt(999);


    public Guest(String firstName, String lastName, Address address, ContactInformation contactInformation)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactInformation = contactInformation;
        contactInformationList = new ArrayList<>();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public Vehicle getVehicle()
    {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public Integer getReservationId()
    {
        return reservationId;
    }

    public RoomType getRoomType()
    {
        return roomType;
    }

    public void setRoomType(RoomType roomType)
    {
        this.roomType = roomType;
    }

    public ContactInformation getContactInformation()
    {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation)
    {
        this.contactInformation = contactInformation;
    }

    public void printContactInfo()
    {
        for(ContactInformation contact : contactInformationList)
        {
            System.out.println(contact.getContactInfo());
        }
    }

    public void addContactInfoToList(ContactInformation contactInformation)
    {
        contactInformationList.add(contactInformation);
    }

    public void addVehicleToGarage(Garage garage)
    {
        garage.getVehicleList().add(vehicle);
    }

    public void removeVehicleFromGarage(Garage garage)
    {
        garage.getVehicleList().remove(vehicle);
    }

    public void makeReservation(Building building, GregorianCalendar calendar)
    {

    }

}
