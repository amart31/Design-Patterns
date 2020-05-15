package com.andy.designpatterns;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
		
		weatherData.setMeasurements(80, 45, 5f);
		
		currentDisplay.update(34, 34, 5f);
		
		currentDisplay.display();

	}

}
