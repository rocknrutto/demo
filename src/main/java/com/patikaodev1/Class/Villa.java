package com.patikaodev1.Class;

import lombok.*;

@Getter
@Setter
public class Villa extends House {
    public Villa(int area, int roomCount, int pricePerSquareMeter) {
        super("Villa", area, roomCount, pricePerSquareMeter);
    }
}
