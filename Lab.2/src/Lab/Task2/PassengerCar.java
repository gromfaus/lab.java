package Lab.Task2;

class PassengerCar extends Car{
	private String fuelConsumption;
	private String accelerationTime;
	/**
	 * Constructors
	 */
	public PassengerCar() {
		super();
		this.fuelConsumption = null;
		this.accelerationTime = null;
	}
	public PassengerCar(String carModel, String engineType, String power, String weight) {
		super(carModel, engineType, power, weight);
		this.fuelConsumption = null;
		this.accelerationTime = null;
	}
	public PassengerCar(String carModel, String engineType, String power, String weight, String carMileage, String fuelConsumption, String accelerationTime) {
		super(carModel, engineType, power, weight, carMileage);
		this.fuelConsumption = fuelConsumption;
		this.accelerationTime = accelerationTime;
	}
	/**
	 * Getters
	 */
	public String getFuelConsumption() {
		return fuelConsumption;
	}
	/**
	 * Setters
	 */
	public String getAccelerationTime() {
		return accelerationTime;
	}
	@Override
	protected String carType() {
		return "This is a passenger car!";
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Fuel Consumption: " + fuelConsumption + "; Acceleration Time: " + accelerationTime;
	}
}
