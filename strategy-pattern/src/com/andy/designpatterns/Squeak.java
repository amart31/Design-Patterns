package com.andy.designpatterns;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeak squeak squeak");
	}

}
