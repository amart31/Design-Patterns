package com.andy.designpatterns;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	//holds the list of observers to be notified
	public ArrayList<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		//initialize the ArrayList when we call constructor
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}

	}
	//enhanced for loop updates all observers when information changes,
	//its then called inside measumentsChanged()
	@Override
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(temperature, humidity, pressure);
		}

	}
	
	//we notify Observers when we get updated measurements from the Weather Station
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

}
