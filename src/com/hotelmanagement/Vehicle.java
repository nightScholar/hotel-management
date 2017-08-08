package com.hotelmanagement;

public class Vehicle
{
    private String make;
    private String model;
    private Integer year;
    private VehicleType vehicleType;


    public Vehicle()
    {

    }

    public Vehicle(String make, String model, Integer year, VehicleType vehicleType)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleType = vehicleType;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public Integer getYear()
    {
        return year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    public VehicleType getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }
}
