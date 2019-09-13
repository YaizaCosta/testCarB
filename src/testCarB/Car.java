package testCarB;

//import java.util.Scanner;

public class Car {

	private String carMake, carModel, yearCategory;
	private int yearMan, yearOld;
	private float price;
	boolean answer = true;


	//Constructor
	public Car (String carMakeX, String carModelX, int yearManX, float priceX, int yearOldX,  String yearCategoryX){
		carMake = carMakeX;
		carModel = carModelX;
		yearMan = yearManX;
		price = priceX;	
		yearOld = yearOldX;
		yearCategory = yearCategoryX;
	}

	//Getters
	public String getCarMake() {
		return carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public int getYearMan() {
		return yearMan;
	}

	public float getPrice() {
		return price;
	}


	//Setters
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	public void setYearMan(int yearMan) {
		this.yearMan = yearMan;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	//It takes the year manufacture value we are introducing and, and the current year to calculate how old is the car 
	public int getyearOld() {
		int yearOld= (2018 - yearMan);
		return yearOld;
	}

	//Once we have the value year old we can assign a category to it
	public String getCategory(){

		if (yearOld>=1 && yearOld<=3) {
			yearCategory = ("Shiny new");}

		else if (yearOld >3 && yearOld<6) {
			yearCategory = ("Slightly worn");}

		else if (yearOld >6 && yearOld<8) {
			yearCategory = ("Past its best");}

		else if (yearOld >8 && yearOld<10) {
			yearCategory = ("showing signs of age");}

		else   {
			yearCategory = ("Banger");}
		return yearCategory;		
	}

	public void print() {
		//System.out.println("Car details: "+ carMake +" "+ carModel + " from " + yearMan + " and with a price of " + price + "€" + " and is"+ yearCategory );
		System.out.println(carMake +" "+ carModel + " is " + yearOld + " years old and is"+ yearCategory );
	}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	