package Lab.Task2;

class Truck extends Car {
	protected String carryingCapacity;
	protected String bodyType;
	/**	
	 * Constructors
	 */
	public Truck() {
		super();
		this.carryingCapacity = null;
		this.bodyType = null;
	}
	public Truck(String carModel, String engineType, String power, String weight) {
		super(carModel, engineType, power, weight);
		this.carryingCapacity = null;
		this.bodyType = null;
	}
	public Truck(String carModel, String engineType, String power, String weight, String carMileage, String carryingCapacity, String bodyType) {
		super(carModel, engineType, power, weight, carMileage);
		this.carryingCapacity = carryingCapacity;
		this.bodyType = bodyType;
	}
	/**
	 * Getters
	 */
	public String getCarryingCapacity() {
		return carryingCapacity;
	}
	public String getBodyType() {
		return bodyType;
	}
	/**
	 * Setters
	 */
	public void setCarryingCapacity(String carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	@Override
	protected String carType() {
		return "This is a truck!";
	}
	@Override
	public String toString() {
		return super.toString() + "; Carrying Capacity: " + carryingCapacity + "; Body Type: " + bodyType;
	}
}
