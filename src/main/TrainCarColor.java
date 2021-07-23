package main;

public enum TrainCarColor {
	PINK, WHITE, BLUE, YELLOW, ORANGE, BLACK, RED, GREEN, LOCOMOTIVE;
	
	public String toString()  {
		return this.name().toLowerCase();
	}
}
