package de.uni.koeln.sse.se;

public class PriceCalculator implements Visitor{
	
	
	public void visitGlass(Glass g){
		int thickness =g.getTickness(); 
		int length = g.getLenght();
		String name = g.getName(); 
		double cost_for_cm; 
			if (thickness == 1) {
				cost_for_cm = 0.02;  //euro
				
		} else if (thickness ==2) {
			cost_for_cm = 0.012; 
		} else {
			cost_for_cm = 0.007; 
		}
		
		double price = length * cost_for_cm; 	
		System.out.println("Total Cost for " + name + " is: " + price + " Euros"); 
		
	}


	public void visitFurniture(Furniture f) {

		String name = f.getName();
		double weight = f.getWeight(); 
		double cost_for_kg =0.25; 
		double price = cost_for_kg *weight; 
		System.out.println("Total Cost for " + name + " is: " + price + " Euros"); 
		
	}


	public void visitElectronic(Electronic e) {

		int weight = e.getWeight(); 
		boolean fragility = e.getFragile(); 
		double cost_for_kg; 
		String name = e.getName();
		if (fragility == true) {
			cost_for_kg = 0.5; 
		}else {
			cost_for_kg = 0.333333333; 
		}
		double price = weight * cost_for_kg;
		System.out.println("Total Cost for " + name + " is: " + price + " Euros"); 
	}

	public void calculatePrice(HouseholdItem h ) {
		h.accept(this);
	}

}
