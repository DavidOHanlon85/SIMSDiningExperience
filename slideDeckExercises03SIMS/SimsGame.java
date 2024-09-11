package slideDeckExercises03SIMS;

import java.util.ArrayList;

public class SimsGame {

	public static void main(String[] args) {

		ArrayList<Person> diners = new ArrayList<Person>();
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		diners.add(p1);
		diners.add(p2);
		
		ArrayList<Pest> pests = new ArrayList<Pest>();
		
		Pest pest1 = new Housefly();
		Pest pest2 = new Telesales();
		
		pests.add(pest1);
		pests.add(pest2);
		
		Pest pest3 = new Baby();
		pests.add(pest3);
		
		DiningRoom diningRoom = new DiningRoom(pests, diners);
		
		diningRoom.serveFood();
		
	}

}
