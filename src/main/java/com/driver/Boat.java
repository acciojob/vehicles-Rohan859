package com.driver;

public class Boat implements WaterVehicle
{
    String name;
    int capacity;

    public String getVehicleName()
    {
        return name;
    }
    public int getVehicleCapacity()
    {
        return capacity;
    }

    public Boat()
    {
        
    }
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
