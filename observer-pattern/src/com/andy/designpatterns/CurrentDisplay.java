package com.andy.designpatterns;

public class CurrentDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	//here when we create the currentDisplay we add it to the observers ArrayList by passing (this)
	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//display();

	}
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" );
	}

}
