package com.masai;

public class ChechWeather {
	
	public static void main(String[] args) {
		
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.0;//in degree fahrenheit
		
		
		if(isSnowing==true||isRaining==true||temperature<50)
		System.out.println("Let�s stay home.");
		else 
			System.out.println("Let�s go out!");
			
	}

}
