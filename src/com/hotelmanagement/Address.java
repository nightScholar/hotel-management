package com.hotelmanagement;

public class Address
{
    private Integer streetNumber;
    private String streetName;
    private String city;
    private String state;
    private Integer zipCode;
    private Integer unitNumber;


    public Address()
    {

    }

    public Address(Integer streetNumber, String streetName, String city,
                   String state, Integer zipCode, Integer unitNumber)
    {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.unitNumber = unitNumber;
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
}
