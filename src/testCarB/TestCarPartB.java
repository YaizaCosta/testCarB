package testCarB;

public class TestCarPartB {

	public static void main(String[] args) {
		//My cars objects, creating new cars, new car ()
		Car car1 = new Car ("Toyota", "Corolla", 2015, 10500f, 3, " Slighly worn");
		Car car2 = new Car ("Renault", "Megane", 2010, 2500f, 8, " Showing signs of age");
		Car car3 = new Car ("Nissan", "Juke", 2016, 8500f, 2, " Shiny new");
		Car car4 = new Car ("Opel", "Corsa", 1999, 1500f, 9, " Banger");
		Car car5 = new Car ("Citroen", "Xsra", 2005, 4200f,13, " Banger");

		Car [] arrCar = new Car [5];

		arrCar[0] = car1;
		arrCar[1] = car2;
		arrCar[2] = car3;
		arrCar[3] = car4;
		arrCar[4] = car5;

		//Printing from the array of cars, car in position 0,1,2,3 and 4
		arrCar[0].print();
		arrCar[1].print();
		arrCar[2].print();
		arrCar[3].print();
		arrCar[4].print();
	}

}
