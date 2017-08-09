package com.hotelmanagement;

import java.util.List;

public interface RoomType
{
    List<Amenities> getAmenitiesList();
    double getPrice();
    int getBedsInRoom();
}
