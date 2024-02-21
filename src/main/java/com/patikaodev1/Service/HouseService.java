package com.patikaodev1.Service;

import com.patikaodev1.Class.*;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    // Evlerin tutulduğu liste
    private List<House> houses;

    // Consturctor metot
    public HouseService(List<House> houses) {
        this.houses = houses;
    }

    // Evlerin toplam fiyatını hesaplama
    public int getTotalPriceOfHouses() {
        int totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPricePerSquareMeter() * house.getArea();
        }
        return totalPrice;
    }

    // Villaların toplam fiyatını hesaplama
    public int getTotalPriceOfVillas() {
        int totalPrice = 0;
        for (House house : houses) {
            if (house instanceof Villa) {
                totalPrice += house.getPricePerSquareMeter() * house.getArea();
            }
        }
        return totalPrice;
    }

    // Yazlıkların toplam fiyatını hesaplama
    public int getTotalPriceOfSummerHouses() {
        int totalPrice = 0;
        for (House house : houses) {
            if (house instanceof SummerHouse) {
                totalPrice += house.getPricePerSquareMeter() * house.getArea();
            }
        }
        return totalPrice;
    }

    // Tüm tipteki evlerin toplam fiyatını hesaplama
    public int getTotalPriceOfAllHouseTypes() {
        int totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPricePerSquareMeter() * house.getArea();
        }
        return totalPrice;
    }

    // Evlerin ortalama metrekaresini hesaplama
    public double getAverageAreaOfHouses() {
        int totalArea = 0;
        int houseCount = 0;
        for (House house : houses) {
            totalArea += house.getArea();
            houseCount++;
        }
        return (double) totalArea / houseCount;
    }

    // Villaların ortalama metrekaresini hesaplama
    public double getAverageAreaOfVillas() {
        int totalArea = 0;
        int villaCount = 0;
        for (House house : houses) {
            if (house instanceof Villa) {
                totalArea += house.getArea();
                villaCount++;
            }
        }
        return (double) totalArea / villaCount;
    }

    // Yazlıkların ortalama metrekaresini hesaplama
    public double getAverageAreaOfSummerHouses() {
        int totalArea = 0;
        int summerHouseCount = 0;
        for (House house : houses) {
            if (house instanceof SummerHouse) {
                totalArea += house.getArea();
                summerHouseCount++;
            }
        }
        return (double) totalArea / summerHouseCount;
    }

    // Tüm evlerin ortalama metrekaresini hesaplama
    public double getAverageAreaOfAllHouseTypes() {
        int totalArea = 0;
        int houseCount = 0;
        for (House house : houses) {
            totalArea += house.getArea();
            houseCount++;
        }
        return (double) totalArea / houseCount;
    }

    // Oda ve salon sayısına göre evleri filtreleme
    public List<House> filterHousesByRoomCount(int roomCount) {
        return houses.stream().filter(house -> house.hasEqualRooms(roomCount)).collect(Collectors.toList());
    }
}