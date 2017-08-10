package com.hotelmanagement.model.customer;

public class Phone implements ContactInformation
{
    private String phoneNumber;
    private PhoneType phoneType;
    private Boolean hasTextAlerts;


    public Phone(String phoneNumber, PhoneType phoneType, Boolean hasTextAlerts)
    {
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
        this.hasTextAlerts = hasTextAlerts;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public PhoneType getPhoneType()
    {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType)
    {
        this.phoneType = phoneType;
    }

    public Boolean getHasTextAlerts()
    {
        return hasTextAlerts;
    }

    public void setHasTextAlerts(Boolean hasTextAlerts)
    {
        this.hasTextAlerts = hasTextAlerts;
    }


    @Override
    public void printContactInfo()
    {
        System.out.println("Phone Number: " + this.phoneNumber + "\n" + "Phone Type: "
                + phoneType + "\n" + "Text Alerts Enabled: " + hasTextAlerts +
                "\n");
    }
}
