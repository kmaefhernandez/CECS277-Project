package project.designpattern;

public class RoachColony {

	/** Name of the Roach Colony */
	private String name;
	/** Initial Population */
	private int intPop;
	/** The rate the population will grow */
	private double growthRate;
	
	// add a variable for current population?
	
	public RoachColony(String name, int intPop, double growthRate) {
		this.name = name;
		this.intPop = intPop;
		this.growthRate = growthRate;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPop() {
		return intPop;
	}
	
	public double getRate() {
		return growthRate;
	}
	
}
