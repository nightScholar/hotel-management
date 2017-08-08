package com.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class Guest
{
    private String firstName;
    private String lastName;
    private Address address;
    private Vehicle vehicle;
    private RoomType roomType;
    private ContactInformation contactInformation;
    private List<ContactInformation> contactInformationList;


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

}
