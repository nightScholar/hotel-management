package com.hotelmanagement.model.employee;

import com.hotelmanagement.model.building.Building;
import com.hotelmanagement.model.building.Invoice;
import com.hotelmanagement.model.customer.Guest;

import java.util.*;

public class Supervisor extends FullTimeEmployee implements Benefits
{
    private String firstName;
    private String lastName;
    private boolean isMarried;
    private Building building;
    private Map<String, Integer> guestMap;
    private List<Employee> employeeList;

    private Random random = new Random();
    private final Integer idNumber = random.nextInt(999);


    public Supervisor(String firstName, String lastName, Building building)
    {
        super(firstName, lastName);
        this.building = building;
        guestMap = new HashMap<>();
        employeeList = new ArrayList<>();
    }

    public Building getBuilding()
    {
        return building;
    }

    public void setBuilding(Building building)
    {
        this.building = building;
    }

    public Map<String, Integer> getGuestMap()
    {
        return guestMap;
    }

    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    public void printInvoice(Guest guest)
    {

    }


    public void addGuestToMap(Guest guest)
    {
       guestMap.put(guest.getFullName(), guest.getReservationId());
    }

    public void removeGuestFromMap(Guest guest)
    {
        guestMap.remove(guest.getFullName());
    }

    public void printGuestMap()
    {
        for(Map.Entry<String, Integer> keySet : guestMap.entrySet())
        {
            String key = keySet.getKey();
            Integer value = keySet.getValue();

            System.out.print("Name: " + key + ", " + "Reservation ID: "
            + value + "\n");
        }
    }

    public void addEmployeeToList(Employee employee)
    {
        employeeList.add(employee);
    }

    public void removeEmployeeFromList(Employee employee)
    {
        employeeList.remove(employee);
    }

    public void printEmployeeInfo()
    {
        for(Employee employee : employeeList)
        {
            System.out.println(employee.getFirstName() +
                    " " +  employee.getLastName());
        }
    }

    public void printGuestInvoice(Guest guest)
    {
        //Need to look into refactoring this code

        Invoice invoice = new Invoice();
        invoice.setStreetNumber(guest.getAddress().getStreetNumber());
        invoice.setStreetName(guest.getAddress().getStreetName());
        invoice.setCity(guest.getAddress().getCity());
        invoice.setState(guest.getAddress().getState());
        invoice.setZipCode(guest.getAddress().getZipCode());
        invoice.setUnitNumber(guest.getAddress().getUnitNumber());
        invoice.setTotalPrice(guest.getRoomType().getPrice());
        invoice.setRoomType(guest.getRoomType().getBedType().toString());

        System.out.println(guest.getFullName() + "\n" + "***********" +
                "\n" + "Reservation ID: " + guest.getReservationId());

        System.out.println(invoice.formatInvoiceInfo());
    }

    /*
    * Overridden from FullTimeEmployee class
    * */

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public Integer getIdNumber()
    {
        return idNumber;
    }

    @Override
    public boolean isMarried()
    {
        return isMarried;
    }

    @Override
    public void setIsMarried(boolean married)
    {
        isMarried = married;
    }

     /*
    * Overridden from Benefits interface
    * */

    @Override
    public boolean hasMedical()
    {
        return true;
    }

    @Override
    public boolean hasDental()
    {
        return true;
    }

    @Override
    public boolean hasVision()
    {
        return true;
    }
}
