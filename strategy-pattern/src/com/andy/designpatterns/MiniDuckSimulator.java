package com.andy.designpatterns;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		
		
		
		//since we have a sysout on the method, no need to include it inside a sysout
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		
		modelDuck.performFly();
		
		modelDuck.setFlyBehavior(new FlyWithRockets());
		
		modelDuck.performFly();

	}

}
