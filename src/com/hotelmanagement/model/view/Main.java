package com.hotelmanagement.model.view;

import com.hotelmanagement.model.building.*;
import com.hotelmanagement.model.customer.*;
import com.hotelmanagement.model.employee.Supervisor;

import java.util.GregorianCalendar;

public class Main
{

    public static void main(String[] args)
    {
        /*Creating address and building objects to be passed into Complex*/

        Address complexAddress = new Address(6573, "Presley Blvd", "Miami", "FL", 78425);
        Garage building1Garage = new Garage("Death Star");
        Building building1 = new Building("Death Star", 1, building1Garage);

        Complex complex1 = new Complex("Complex 1", complexAddress, building1);
        complex1.addBuilding(building1);

        /*Supervisor being assigned to building1*/
        Supervisor supervisor1 = new Supervisor("Eric", "Thompson", building1);


        /*Creating Guest 1 Information and making a Reservation*/

        Address guest1Address = new Address(9743, "Kennedy Place", "Dallas", "Texas", 14309);
        ContactInformation guestEmail = new Email("guest1Email@java.com");
        ContactInformation guest1Phone = new Phone("219-432-6754", PhoneType.MOBILE, true);
        Vehicle guest1Vehicle = new Vehicle("Hyundai", "Sonata", 2017, VehicleType.SEDAN);
        RoomType kingBed = new King();

        Guest guest1 = new Guest("Michael", "Williamson", guest1Address, guestEmail);

        guest1.addContactInfoToList(guestEmail);
        guest1.addContactInfoToList(guest1Phone);
        guest1.setVehicle(guest1Vehicle);
        guest1.addVehicleToGarage(building1Garage);
        guest1.setRoomType(kingBed);

        Reservation guest1Reservation = new Reservation();
        guest1Reservation.setCheckInDate(new GregorianCalendar(2017, 9, 18));
        guest1Reservation.setCheckOutDate(new GregorianCalendar(2017, 9, 29));

        guest1.makeReservation(building1, kingBed, guest1Reservation);

         /*Creating Guest 2 Information and making a Reservation*/

        Address guest2Address = new Address(3614, "Springfield Avenue", "Seattle", "Washington", 36741);
        ContactInformation guest2Email = new Email("guest2Email@java.com");
        ContactInformation guest2Phone = new Phone("432-964-7315", PhoneType.HOME, true);
        Vehicle guest2Vehicle = new Vehicle("Kia", "Optima", 2017, VehicleType.SEDAN);

        Guest guest2 = new Guest("Daniel", "Porter", guest2Address, guestEmail);

        guest2.addContactInfoToList(guest2Email);
        guest2.addContactInfoToList(guest2Phone);
        guest2.setVehicle(guest2Vehicle);
        guest2.addVehicleToGarage(building1Garage);

        RoomType queenBed = new Queen();
        Reservation guest2Reservation = new Reservation();

        guest2Reservation.setCheckInDate(new GregorianCalendar(2017, 8, 5));
        guest2Reservation.setCheckOutDate(new GregorianCalendar(2017, 8, 14));

        guest2.setRoomType(queenBed);
        guest2.makeReservation(building1, queenBed, guest2Reservation);

        /*Adding Guests to Supervisor List and Printing Invoice info*/

        supervisor1.addGuestToMap(guest1);
        supervisor1.addGuestToMap(guest2);

        supervisor1.printGuestMap();

        System.out.println("**************");

        supervisor1.printGuestInvoice(guest1);
        supervisor1.printGuestInvoice(guest2);

    }
}
