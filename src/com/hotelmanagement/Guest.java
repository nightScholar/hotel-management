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






}
