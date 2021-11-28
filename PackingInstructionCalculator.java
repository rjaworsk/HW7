package de.uni.koeln.sse.se;

public class PackingInstructionCalculator implements Visitor{

	
	
	public void calculateInstructions(HouseholdItem h) {
		
		h.accept(this);
			

	
	}
	public void visitGlass(Glass g) {
		 
		double length = ((Glass) g).getLenght(); 
		double height = ((Glass) g).getHeight(); 
		double width = ((Glass) g).getWidth(); 
		System.out.println("Packing Instruction: Box with a dimension "+  ++height + " x " + ++length +" x "+ ++width + " and fill the box with bubblewrap.");

	}


	public void visitFurniture(Furniture f) {
		 
		double length = ((Furniture) f).getLenght(); 
		double height = ((Furniture) f).getHeight(); 
		double width = ((Furniture) f).getWidth(); 
	
		  
        System.out.println("Packing Instruction: Covered in waterproof covers with an are of " + length +  " x " + width ); 
				
	
	}


	public void visitElectronic(Electronic e) {

		double length = ((Electronic) e).getLenght(); 
		double height = ((Electronic) e).getHeight(); 
		double width = ((Electronic) e).getWidth(); 
		
		
		System.out.println("Packing Instruction: Covered with Polyethylene foam film and in a box with a dimension " +  ++height + " x " + ++length + " x "+ ++width);
	    

		
		
	}
	}
