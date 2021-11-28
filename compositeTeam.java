package Task2;

import java.util.ArrayList;
import java.util.List;

public class compositeTeam implements Team{
  
	private List<Team> teams = new ArrayList<>();
	public String name; 

	public void print_number_athletes() {
		
		System.out.println(name);
		for (Team team : teams) {
			
			team.print_number_athletes();
					}
		
	}

	
	public void print_number_goldmedalls() {
		
		System.out.println(name);
		for (Team team : teams) {
			
			team.print_number_goldmedalls();
					}
		
	}
	
	public compositeTeam(String name) {
		this.name = name; 

	}
	
	public void addTeam(Team t ) {
		teams.add(t);
	}
	}

