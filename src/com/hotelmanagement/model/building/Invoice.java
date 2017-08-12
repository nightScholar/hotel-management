package com.hotelmanagement.model.building;

public class Invoice
{
    private Double totalPrice;
    private String guestIdNumber;


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

    public String getGuestIdNumber()
    {
        return guestIdNumber;
    }

    public void setGuestIdNumber(String guestIdNumber)
    {
        this.guestIdNumber = guestIdNumber;
    }
}
