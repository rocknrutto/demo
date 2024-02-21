package com.patikaodev1.Class;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class House {
    private String type;
    private int area;
    private int roomCount;
    private int pricePerSquareMeter;

    public boolean hasEqualRooms(int _roomCount) {
        return roomCount == _roomCount;
    }
}
