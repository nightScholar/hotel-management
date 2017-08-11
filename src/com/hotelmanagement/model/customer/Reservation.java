package com.hotelmanagement.model.customer;

import java.util.GregorianCalendar;

public class Reservation
{
    private Integer reservationNumber;
    private GregorianCalendar calendar;


    public Reservation(Integer reservationNumber, GregorianCalendar calendar)
    {
        this.reservationNumber = reservationNumber;
        this.calendar = calendar;
    }

    public Integer getReservationNumber()
    {
        return reservationNumber;
    }

    public void setReservationNumber(Integer reservationNumber)
    {
        this.reservationNumber = reservationNumber;
    }

    public GregorianCalendar getCalendar()
    {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar)
    {
        this.calendar = calendar;
    }
}
