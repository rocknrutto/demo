package com.patikaodev1.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patikaodev1.Class.*;
import com.patikaodev1.Service.HouseService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		// Evlerin listesi
		List<House> houses = new ArrayList<>();

		// Örnek evler oluşturuluyor ve evlerin listesine ekleniyor
		houses.add(new House(null, 100, 3, 2000));
		houses.add(new House(null, 120, 4, 2500));
		houses.add(new House(null, 80, 2, 1800));
		houses.add(new Villa(300, 5, 6000));
		houses.add(new Villa(400, 6, 8000));
		houses.add(new Villa(350, 4, 7000));
		houses.add(new SummerHouse(80, 2, 1500));
		houses.add(new SummerHouse(90, 2, 1600));
		houses.add(new SummerHouse(100, 3, 1700));

		// Ev hizmeti oluşturuluyor ve örnek evler listesi ile başlatiliyor
		HouseService houseService = new HouseService(houses);

		// Toplam fiyatlar konsola yazdiriliyor
		System.out.println("Tüm evlerin toplam fiyati: " + houseService.getTotalPriceOfHouses());
		System.out.println("Villalarin toplam fiyati: " + houseService.getTotalPriceOfVillas());
		System.out.println("Yazlik evlerin toplam fiyati: " + houseService.getTotalPriceOfSummerHouses());
		System.out.println("Tüm ev tiplerinin toplam fiyati: " + houseService.getTotalPriceOfAllHouseTypes());

		// Ortalama alanlar konsola yazdiriliyor
		System.out.println("Tüm evlerin ortalama alani: " + houseService.getAverageAreaOfHouses());
		System.out.println("Villalarin ortalama alani: " + houseService.getAverageAreaOfVillas());
		System.out.println("Yazlik evlerin ortalama alani: " + houseService.getAverageAreaOfSummerHouses());
		System.out.println("Tüm ev tiplerinin ortalama alani: " + houseService.getAverageAreaOfAllHouseTypes());

		// Belirli oda sayisina göre evler filtreleniyor ve konsola yazdiriliyor
		int odaSayisi = 3;
		List<House> filteredHouses = houseService.filterHousesByRoomCount(odaSayisi);
		System.out.println(odaSayisi + " odali evler:");
		for (House house : filteredHouses) {
			System.out.println("Tip: " + house.getType() + ", Alan: " + house.getArea() + ", Oda Sayisi: "
					+ house.getRoomCount() + ", Metrekare Başina Fiyat: " + house.getPricePerSquareMeter());
		}
	}

}
