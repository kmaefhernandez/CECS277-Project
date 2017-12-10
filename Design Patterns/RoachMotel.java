package project.designpattern;

import java.util.ArrayList;

public class RoachMotel {

	private static final int ROOMS = 10;
	private int occupiedRooms;
	private ArrayList<RoachColony> customers;
	private Boolean vacant; // or change to string
	
	public RoachMotel() {
		occupiedRooms = 0;
		customers = new ArrayList<RoachColony>();
		vacant = true; // or if string vacant = "Rooms Available"
	}
	
	public void checkIn(RoachColony customer) {
		customers.add(customer);
	}
	
	public void checkOut(RoachColony customer) {
		customers.remove(customer); // prob change idk
	}
	
	
	public void full() {
		// TODO when full put up no vacancy sign
			// TODO take down when space opens up 
	}
}
