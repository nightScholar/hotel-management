package com.hotelmanagement;

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
    public String getContactInfo()
    {
        String contactInfo = "Email Address: " + this.emailAddress;

        return contactInfo;
    }
}
