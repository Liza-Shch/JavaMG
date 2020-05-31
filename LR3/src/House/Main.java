package House;

import House.House;

public class Main {
	public static void main(String[] args) {
		int n = 10;
		House[] houses = House.createFactory(n);
		System.out.println("Список квартир");
		for (House house: houses) {
			System.out.println(house.toString());
		}
		
		int roomCount = 5;
		System.out.println("Список квартир , имеющих заданное число комнат");
		for (House house: houses) {
			boolean isValid = house.filterByRoomCount(roomCount);
			if (isValid) {
				System.out.println(house.toString());
			}
		}
		
		int low = 2;
		int high = 15;
		System.out.println("Список квартир , имеющих заданное число комнат и этаж в диапазоне");
		for (House house: houses) {
			boolean isValid = house.filterByRoomCount(roomCount) && house.filterByFloor(low, high);
			if (isValid) {
				System.out.println(house.toString());
			}
		}
		
		int square = 100;
		System.out.println("Список квартир , имеющих площадь, превосходящую заданную");
		for (House house: houses) {
			boolean isValid = house.filterBySquare(square);
			if (isValid) {
				System.out.println(house.toString());
			}
		}
		
	}

}
