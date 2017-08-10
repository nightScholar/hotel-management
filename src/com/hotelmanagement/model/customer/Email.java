package com.hotelmanagement.model.customer;

public class Email implements ContactInformation
{
    private String emailAddress;


    public Email(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }


    @Override
    public void printContactInfo()
    {
        System.out.println("Email Address: " + this.emailAddress);
    }
}
