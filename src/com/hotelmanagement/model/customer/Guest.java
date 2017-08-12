package com.hotelmanagement.model.customer;

import com.hotelmanagement.model.building.Building;
import com.hotelmanagement.model.building.Garage;
import com.hotelmanagement.model.building.RoomType;

import java.util.ArrayList;
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
    private Reservation reservation;
    private List<ContactInformation> contactInformationList;

    private Random random = new Random();
    private final Integer reservationId = random.nextInt(999);


    public Guest()
    {

    }

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

    public String getFullName()
    {
        return firstName + " " + lastName;
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

    public Reservation getReservation()
    {
        return reservation;
    }

    public void setReservation(Reservation reservation)
    {
        this.reservation = reservation;
    }

    public void printContactInfo()
    {
        for(ContactInformation contact : contactInformationList)
        {
            contact.printContactInfo();
        }
    }

    public void addContactInfoToList(ContactInformation contactInformation)
    {
        contactInformationList.add(contactInformation);
    }

    public void addVehicleToGarage(Garage garage)
    {
        try
        {
            if(garage.getVehicleList().size() > garage.getCapacity())
            {
                throw new IllegalStateException();
            }
            else
            {
                garage.getVehicleList().add(this.vehicle);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println(garage.getName() + " Garage has reached its maximum capacity," +
                    "no more vehicles can be added");
        }
    }

    public void removeVehicleFromGarage(Garage garage)
    {
        try
        {
            if(garage.getVehicleList().size() == 0)
            {
                throw new IllegalStateException();
            }
            else
            {
                garage.getVehicleList().remove(this.vehicle);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println(garage.getName() + " Garage does not have any vehicles to remove");
        }
    }

    public void makeReservation(Building building, RoomType roomType, Reservation reservation)
    {
        try
        {
            if(building.getRoomTypeList().size() == building.getCapacity())
            {
               throw new IllegalStateException();
            }
            else
            {
                building.getRoomTypeList().remove(roomType);
            }
        }
        catch (IllegalStateException exception)
        {
            System.out.println("Sorry, there are no more rooms " +
                    "available to reserve. Please check back soon!");
        }

        reservation.setReservationNumber(this.reservationId);
        reservation.setBuildingName(building.getName());
        reservation.setRoomType(roomType.getBedType().toString());
    }

}
