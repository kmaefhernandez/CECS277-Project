package project.designpattern;

public class FoodBar extends RoomDecorator {
	
	protected Amenity room;
	
	public static final int COST = 10;

	 public FoodBar(Amenity room) {
		  this.room = room;
		 }
		 
		 public String getDescription() {
		  return room.getDescription() + " added food bar.";
		 }

		 public double cost() {
		  return room.cost() + COST;
		 }

}
