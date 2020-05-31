package House;

import java.util.Date;

public class House {
	public static enum BuildingTypes {
		Living,
		Country,
		Industrial,
	};

	private int id = 0;
	private int number = 0;
	private int square = 0;
	private int floor = 0;
	private int roomCount = 0;
	private String street = "";
	private House.BuildingTypes buildingTtype;
	private Date lifetime;
	
	public House() {
		this.setId((int) Math.random());
		this.setNumber((int) (Math.random() * 1000 + 1));
		this.setSquare((int) (Math.random() * 200 + 1));
		this.setFloor((int) (Math.random() * 20 + 1));
		this.setRoomCount((int) (Math.random() * 5 + 1));
		this.setStreet("Street");
		this.setBuildingTtype(House.BuildingTypes.Living);
		this.setLifetime(new Date());
	}
	
	public House(House house) {
		this.setId((int) Math.random());
		this.setNumber(house.number);
		this.setSquare(house.square);
		this.setFloor(house.floor);
		this.setRoomCount(house.roomCount);
		this.setStreet(house.street);
		this.setBuildingTtype(house.buildingTtype);
		this.setLifetime(house.lifetime);
	}
	
	public House(
			int number,
			int square,
			int floor,
			int roomCount,
			String street,
			House.BuildingTypes buildingType,
			Date lifetime
	) {
		this.setId((int) Math.random());
		this.setNumber(number);
		this.setSquare(square);
		this.setFloor(floor);
		this.setRoomCount(roomCount);
		this.setStreet(street);
		this.setBuildingTtype(buildingTtype);
		this.setLifetime(lifetime);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public House.BuildingTypes getBuildingTtype() {
		return buildingTtype;
	}

	public void setBuildingTtype(House.BuildingTypes buildingTtype) {
		this.buildingTtype = buildingTtype;
	}

	public Date getLifetime() {
		return lifetime;
	}

	public void setLifetime(Date lifetime) {
		this.lifetime = lifetime;
	}
	
	public String toString() {
		return "number: " + Integer.toString(this.getNumber()) + 
				"\nsquare: " + Integer.toString(this.getSquare()) +
				"\nfloor: " + Integer.toString(this.getFloor()) +
				"\nrooms count: " + Integer.toString(this.getRoomCount()) +
				"\nstreet: " + this.getStreet() +
				"\nbuilding type: " + this.getBuildingTtype() +
				"\nlifetime: " + this.getLifetime() + "\n";
 	}
	
	public static House[] createFactory(int count) {
		House[] houses = new House[count];
		for (int i = 0; i < count; i++) {
			houses[i] = new House();
		}
		
		return houses;
	}
	
	public boolean filterByRoomCount(int roomCount) {
		return this.getRoomCount() == roomCount;
	}
	
	public boolean filterByFloor(int low, int high) {
		return this.getFloor() >= low && this.getFloor() <= high;
	}
	
	public boolean filterBySquare(int square) {
		return this.getSquare() > square;
	}
}
