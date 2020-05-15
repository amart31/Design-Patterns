package com.andy.designpatterns;

public abstract class Duck {
	
	//reference variables for the behavior interface types
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	//delegate to the behavior class
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("All ducks swim, even decoys!");
	}
	

}
