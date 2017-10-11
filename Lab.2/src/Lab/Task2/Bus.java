package Lab.Task2;

class Bus extends PassengerCar {
	private String numberOfSeats;
	/**
	 * Constructors
	 */
	public Bus() {
		super();
		this.numberOfSeats = null;
	}
	public Bus(String carModel, String engineType, String power, String weight) {
		super(carModel, engineType, power, weight);
		this.numberOfSeats = null;
	}
	public Bus(String carModel, String engineType, String power, String weight, String carMileage, String fuelConsumption, String accelerationTime, String numberOfSeats) {
		super(carModel, engineType, power, weight, carMileage, fuelConsumption, accelerationTime);
		this.numberOfSeats = numberOfSeats;
	}
	/**
	 * Getters
	 */
	public String getNumberOfSeats() {
		return numberOfSeats;
	}
	/**
	 * Setters
	 */
	public void setNumberOfSeats(String numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	protected String carType() {
		return "This is a bus!";
	}
	@Override
	public String toString() {
		return super.toString() + "; Number of seats: " + numberOfSeats;
	}
}
