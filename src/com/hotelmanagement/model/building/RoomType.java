package com.hotelmanagement.model.building;

import com.hotelmanagement.model.building.item.Amenities;

import java.util.List;

public interface RoomType
{
    List<Amenities> getAmenitiesList();
    double getPrice();
    int getBedsInRoom();
}