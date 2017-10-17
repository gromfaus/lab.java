package Lab.Task2;

public class Car {
	private String carModel, engineType, power, weight, carMileage;
	/**
	 * Constructors
	 */
	protected Car() {}
	
	protected Car(String carModel, String engineType, String power, String weight) {
		this.carModel = carModel;
		this.setEngineType(engineType);
		this.setPower(power);
		this.setWeight(weight);
	}
	
	protected Car(String carModel, String engineType, String power, String weight, String carMileage) {
		this.carModel = carModel;
		this.setEngineType(engineType);
		this.setPower(power);
		this.setWeight(weight);
		this.setCarMileage(carMileage);
	}
	/**
	 * Getters
	 */
	public String getCarModel() {
		return carModel;
	}
	public String getEngineType() {
		return engineType;
	}
	public String getPower() {
		return power;
	}
	public String getWeight() {
		return weight;
	}
	public String getCarMileage() {
		return carMileage;
	}
	/**
	 * Setters
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}	
	public void setPower(String power) {
		this.power = power;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void setCarMileage(String carMileage) {
		this.carMileage = carMileage;
	}
	protected String carType() {
		return "This is car!";
	}
	
	@Override
	public String toString() {
		return carType() + " Car model: " + carModel + "; Engine type: " + engineType + "; Power: " + power + "; Weight: " + weight + "; Car mileage: " + carMileage;
	}
}
