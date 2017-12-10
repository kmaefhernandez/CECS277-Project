package project.designpattern;

public class Spa {

	public static final int COST = 20;
	
	protected Amenity room;
	
	 public Spa(Amenity room) {
		  this.room = room;
		 }
		 
		 public String getDescription() {
		  return room.getDescription() + " added food bar.";
		 }

		 public double cost() {
		  return room.cost() + COST;
		 }
}
