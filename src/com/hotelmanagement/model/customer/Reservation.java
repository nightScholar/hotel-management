package com.hotelmanagement.model.customer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reservation
{
    private Integer reservationNumber;
    private GregorianCalendar checkInDate;
    private GregorianCalendar checkOutDate;
    private String buildingName;
    private String roomType;


    public Reservation()
    {

    }

    public Reservation(GregorianCalendar checkInDate, GregorianCalendar checkOutDate)
    {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Integer getReservationNumber()
    {
        return reservationNumber;
    }

    public void setReservationNumber(Integer reservationNumber)
    {
        this.reservationNumber = reservationNumber;
    }

    public GregorianCalendar getCheckInDate()
    {
        switch (this.checkInDate.get(Calendar.MONTH))
        {
            case 0: System.out.print("January");
                break;
            case 1: System.out.print("February");
                break;
            case 2: System.out.print("March");
                break;
            case 3: System.out.print("April");
                break;
            case 4: System.out.print("May");
                break;
            case 5: System.out.print("June");
                break;
            case 6: System.out.print("July");
                break;
            case 7: System.out.print("August");
                break;
            case 8: System.out.print("September");
                break;
            case 9: System.out.print("October");
                break;
            case 10: System.out.print("November");
                break;
            case 11: System.out.print("December");
                break;
            default: System.out.println("Error: invalid status");
                System.exit(1);
        }

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

    public String getBuildingName()
    {
        return buildingName;
    }

    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public GregorianCalendar getMonth()
    {
        switch (this.checkInDate.get(Calendar.MONTH))
        {
            case 0: System.out.print("January");
                break;
            case 1: System.out.print("February");
                break;
            case 2: System.out.print("March");
                break;
            case 3: System.out.print("April");
                break;
            case 4: System.out.print("May");
                break;
            case 5: System.out.print("June");
                break;
            case 6: System.out.print("July");
                break;
            case 7: System.out.print("August");
                break;
            case 8: System.out.print("September");
                break;
            case 9: System.out.print("October");
                break;
            case 10: System.out.print("November");
                break;
            case 11: System.out.print("December");
                break;
            default: System.out.println("Error: invalid status");
                System.exit(1);
        }

        return this.checkInDate;
    }

    public String checkOutDateToString()
    {
        checkOutDate.get(Calendar.MONTH);
        checkOutDate.get(Calendar.DAY_OF_MONTH);
        checkOutDate.get(Calendar.YEAR);

        return null;
    }
}
