package Lab.Task2;

public class Runner {
	public static void main(String[] args) {
		Car[] mas = new Car[10];
		mas[0] = new PassengerCar("BMW", "Gasoline", "500 hp", "2100 kg", "100000 km", "32 l/100km", "3.7 s");
		mas[1] = new Truck("Scania", "Diesel", "730 hp", "6350 kg", "60000 km", "100 t", "Closed");
		mas[2] = new Bus("MAN", "Diesel", "350 hp", "7300", "320000 km", "25 l/100km", "25 s", "175");
		mas[3] = new PassengerCar("Daewoo", "Gasoline", "51 hp", "800 kg", "30000 km", "7 l/100km", "17.3 s");
		mas[4] = new Truck("Volvo", "Diesel", "560 hp", "8100 kg", "250000 km", "120 t", "Closed");
		mas[5] = new Bus("Maz", "Diesel", "270 hp", "4500", "220000 km", "30 l/100km", "35 s", "211");
		mas[6] = new PassengerCar("Alfa", "Gasoline", "150 hp", "1600 kg", "250000 km", "9 l/100km", "8.4 s");
		mas[7] = new Truck("MAN", "Diesel", "320 hp", "5900 kg", "150000 km", "100 t", "Closed");
		mas[8] = new Bus("Icarus", "Diesel", "210 hp", "5200 kg", "500000 km", "30 l/100km", "24 s", "100");
		mas[9] = new PassengerCar("Opel", "Gasoline", "136 hp", "2100 kg", "360000", "15 l/100km", "11 s");
		
		for(int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}
}

