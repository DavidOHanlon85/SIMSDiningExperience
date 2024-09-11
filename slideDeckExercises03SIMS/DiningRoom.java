package slideDeckExercises03SIMS;

import java.util.ArrayList;

public class DiningRoom {
	
	
	public ArrayList<Pest> pests;
	public ArrayList<Person> diners;
	
	/**
	 * @param pests
	 * @param diners
	 */
	public DiningRoom(ArrayList<Pest> pests, ArrayList<Person> diners) {
		this.pests = pests;
		this.diners = diners;
	}
	
	public void serveFood() {
		System.out.println("Serving food");
		
		for (Pest p : pests) {
			p.beAnnoying();
		}
	}
	
	
	

}
