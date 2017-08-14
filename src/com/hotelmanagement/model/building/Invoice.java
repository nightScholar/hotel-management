package com.hotelmanagement.model.building;

import java.util.GregorianCalendar;

public class Invoice
{
    private Double totalPrice;
    private Integer guestIdNumber;

    private Integer streetNumber;
    private String streetName;
    private String city;
    private String state;
    private Integer zipCode;
    private Integer unitNumber;

    private GregorianCalendar checkInDate;
    private GregorianCalendar checkOutDate;

    private String roomType;


    public Invoice()
    {

    }

    public Double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public Integer getGuestIdNumber()
    {
        return guestIdNumber;
    }

    public void setGuestIdNumber(Integer guestIdNumber)
    {
        this.guestIdNumber = guestIdNumber;
    }

    public Integer getStreetNumber()
    {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber)
    {
        this.streetNumber = streetNumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public Integer getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(Integer zipCode)
    {
        this.zipCode = zipCode;
    }

    public Integer getUnitNumber()
    {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber)
    {
        this.unitNumber = unitNumber;
    }

    public GregorianCalendar getCheckInDate()
    {
        return checkInDate;
    }

    public void setCheckInDate(GregorianCalendar checkInDate)
    {
        this.checkInDate = checkInDate;
    }

    public GregorianCalendar getCheckOutDate()
    {
        return checkOutDate;
    }

    public void setCheckOutDate(GregorianCalendar checkOutDate)
    {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public String formatInvoiceInfo()
    {
        String invoiceInfo = "Street Number: " + streetNumber + "\n" +
        "Street Name: " + streetName + "\n" +  "City: " + city +
        "\n" + "State: " + state + "\n" + "Zip Code: " + zipCode + "\n" +
        "Unit Number: " + unitNumber + "\n" + "Check In date: " + checkInDate +
        "\n" + "Check out date: " + checkOutDate + "\n" +
        "Room Type: " + roomType + "\n" + "Total Price: " + totalPrice + "\n";

        return invoiceInfo;
    }
}
