package testCarB;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCarPartC {
	public static void main(String[] args) {

		//Attributes
		String carMake, carModel, yearCategory = null;
		int yearMan,yearOld = 0, carNumber = 0;
		float price;
		boolean answer = true;

		//ArrayList to store the information the user is providing 
		ArrayList<Car> alistcars = new ArrayList <Car>();

		Scanner scan = new Scanner (System.in);	

		//Print menu
		System.out.println("1. Add a car"); 
		System.out.println("2. Remove a car");
		System.out.println("3. List all the cars available");
		System.out.println("4. Quit");

		//Initializing quit = exit the program as a false 
		boolean quit = false;
		int option;

		do {
			System.out.println("Choose one of the options below");
			option = scan.nextInt();

			switch (option) {

			case 1: System.out.println("**** Welcome to the Add a Car section ****");
			while (answer == true) { 

				System.out.print("Enter the car make: ");
				carMake = scan.next();

				System.out.print("Enter the car model: ");
				carModel = scan.next();

				System.out.print ("Enter the car year: ");
				yearMan= scan.nextInt();

				System.out.print ("Enter the car price: ");
				price = scan.nextFloat();

				alistcars.add( new Car(carMake, carModel, yearMan, price, yearOld, yearCategory));

				//Options true/false to keep entering information 
				System.out.print("Do you want to keep entering new car details (true/false)?\n");
				answer = scan.nextBoolean();
			}
			if (answer == false) {

				System.out.println("****** Thank you for adding a car *****\n");}
			break;

			case 2: System.out.println("**** Welcome to the Remove a car section ****");
			System.out.print("What car number would you like to remove");
			//-1 because the customer will choose number 1, thinking the first car is in index 1 but it is in 0
			carNumber = scan.nextInt() -1;
			//ArrayList and remove the carNumber that the user choose
			alistcars.remove(carNumber);

			break;

			case 3: System.out.println("**** Welcome to the list of all available cars ****");
			//For loop that check the ArrayList
			for (int i=0; i<alistcars.size(); i++) {
				carNumber = i+1;
				System.out.println (carNumber+ " " + alistcars.get(i).getCarMake()
						+ " " + alistcars.get(i).getCarModel() + " is " 
						+ alistcars.get(i).getyearOld() 
						+ " years old and is " + alistcars.get(i).getCategory() +"\n");
			}

			break;

			//Exit the program
			case 4: quit = true;
			break;
			}

		} while (!quit);
		System.out.println("Bye!");
	}

}

/*What are the advantages of using an ArrayList over an array? Place the answer in a comment at the end of your code.	

An array has a fixed length, so you can’t add more elements once is full (size the developer predetermined in
the array), also if there are empty elements the space occupied in memory it is the same, it doesn’t
get smaller. On the other hand, and arrayList can grow or shrink, if we add or remove elements from our arrayList, 
so from the point of view of memory and array list is a better option. */

