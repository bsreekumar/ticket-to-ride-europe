package main;

public class Player {
	private PlayerColor color;
	private int numOfTrainCars;
	private int numOfStations;
	/**
	 * @param color - Player Color
	 * @param numOfTrainCars - defaulted to 45
	 * @param numOfStations - defaulted to 3
	 */
	public Player(PlayerColor color) {
		super();
		
		if(color == null) throw new IllegalArgumentException("Error - PlayerColor Required.");
		
		
		this.color = color;
		this.numOfTrainCars = 45;
		this.numOfStations = 3;
	}
	/**
	 * @return the color
	 */
	public PlayerColor getColor() {
		return color;
	}
	/**
	 * @return the numOfTrainCars
	 */
	public int getNumOfTrainCars() {
		return numOfTrainCars;
	}
	/**
	 * @param numOfTrainCars the numOfTrainCars to set
	 */
	public void setNumOfTrainCars(int numOfTrainCars) {
		if (numOfTrainCars < 0 || numOfTrainCars > 45) throw new IllegalArgumentException("Error - Invalid Number of Train Cars.");
		this.numOfTrainCars = numOfTrainCars;
	}
	/**
	 * @return the numOfStations
	 */
	public int getNumOfStations() {
		return numOfStations;
	}
	/**
	 * @param numOfStations the numOfStations to set
	 */
	public void setNumOfStations(int numOfStations) {
		if (numOfStations < 0 || numOfStations > 3) throw new IllegalArgumentException("Error - Invalid Number of Stations.");
		this.numOfStations = numOfStations;
	}
	
	
	
}
