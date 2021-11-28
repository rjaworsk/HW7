package Task2;

public class leafTeam implements Team{

	public String name; 
	public int Number_of_athletes; 
	public int Number_of_goldmedals; 

	public void print_number_athletes() {
		System.out.println("Team: " + name + " , Number of Athletes: " + Number_of_athletes); 
		
	}


	public void print_number_goldmedalls() {
	   System.out.println("Team: " + name + " , Number of Gold medals: " + Number_of_goldmedals); 
		
	}
	
	public leafTeam(String name, int Number_of_athletes, int Number_of_goldmedals) {
		this.Number_of_athletes = Number_of_athletes; 
		this.Number_of_goldmedals = Number_of_goldmedals; 
		this.name = name; 
	}

}
