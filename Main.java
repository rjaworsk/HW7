
package Task2;


public class Main {

	public static void main(String [] args) {
		
        leafTeam Teakwondo = new leafTeam("Teakwondo", 1,1); 
        leafTeam Waterpolo = new leafTeam("Waterpolo", 2,1); 
        leafTeam ArtisticGymnastic = new leafTeam("Artistic Gymnastic", 6,3); 
        leafTeam Shooting = new leafTeam("Shooting", 1,1); 
        leafTeam Cycling= new leafTeam("Cycling", 1,1); 
        leafTeam Tennis = new leafTeam("Tennis", 1,1); 
        leafTeam TableTennis = new leafTeam("Table Tennis", 5,1); 
        leafTeam Football = new leafTeam("Football", 1,4); 
        leafTeam AlpineSki = new leafTeam("Alpine Sky", 1,2); 
        leafTeam SouthAmerica  = new leafTeam("South America", 2,7); 
		leafTeam AfghanistanTeam = new leafTeam("Afghanistan Team", 0,0);
			
		compositeTeam WomensTeam_China  = new compositeTeam("Women's Team"); 
		WomensTeam_China.addTeam(Teakwondo);
		WomensTeam_China.addTeam(Waterpolo);
		WomensTeam_China.addTeam(ArtisticGymnastic);
		
		
		compositeTeam MensTeam_China  = new compositeTeam("Men's Team"); 
		MensTeam_China.addTeam(Shooting);
		
		compositeTeam ChinaTeam = new compositeTeam("China"); 
		ChinaTeam.addTeam(WomensTeam_China);
		ChinaTeam.addTeam(MensTeam_China);
		
		compositeTeam AsiaTeam = new compositeTeam("Asia"); 
		AsiaTeam.addTeam(ChinaTeam);
		AsiaTeam.addTeam(AfghanistanTeam);
		
		compositeTeam WomensTeam_ger = new compositeTeam("Women's Team: ");
		WomensTeam_ger.addTeam(Cycling);
		WomensTeam_ger.addTeam(Tennis);
		
		compositeTeam MensTeam_ger = new compositeTeam("Men's Team: ");
		MensTeam_ger.addTeam(TableTennis);
		MensTeam_ger.addTeam(Football);
		
		compositeTeam GermanyTeam = new compositeTeam("Germany");
		GermanyTeam.addTeam(MensTeam_ger);
		GermanyTeam.addTeam(WomensTeam_ger);
		
		compositeTeam EuropeTeam = new compositeTeam("Europe: "); 
		EuropeTeam.addTeam(GermanyTeam);
		
		leafTeam AfricaTeam = new leafTeam("Africa: ", 2,2); 
		
		compositeTeam OlympicTeam = new compositeTeam("Olypics Teams: "); 
		OlympicTeam.addTeam(AsiaTeam);
		OlympicTeam.addTeam(EuropeTeam);
		OlympicTeam.addTeam(SouthAmerica);
		OlympicTeam.addTeam(AfricaTeam);
		

		
		MensTeam_ger.print_number_athletes();
		System.out.println(); 
		GermanyTeam.print_number_goldmedalls();
		System.out.println();
		AsiaTeam.print_number_athletes();
		System.out.println();
		OlympicTeam.print_number_athletes();
		
		
		
		
	}
}
