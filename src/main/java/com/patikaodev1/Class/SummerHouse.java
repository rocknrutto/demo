package com.patikaodev1.Class;

import lombok.*;

@Getter
@Setter
public class SummerHouse extends House {
    public SummerHouse(int area, int roomCount, int pricePerSquareMeter) {
        super("Summer House", area, roomCount, pricePerSquareMeter);
    }
}