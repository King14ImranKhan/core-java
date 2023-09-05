package com.java8;
/* If two or more interfaces have same methods then Child class will
 * get confused. 
 */
interface TerrestrialAnimal{
	default public void livesIn() {
		System.out.println("Lives on Land");
	}
}
interface AquaticAnimal{
	default public void livesIn() {
		System.out.println("Lives in water");
	}
}
interface Animal{
	public void specialCapabilities();
	default public void legs() {
		System.out.println("animals have four legs");
	}
}

class DiamondProblem implements Animal,TerrestrialAnimal,AquaticAnimal{

	@Override
	public void specialCapabilities() {
		System.out.println("Frog is an amphibian animal");
		System.out.println("Frog lives in both land and water");
	}

	@Override
	public void livesIn() {
		// TODO Auto-generated method stub
		AquaticAnimal.super.livesIn();
	}
	
}

