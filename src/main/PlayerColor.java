package main;

public enum PlayerColor {
	BLUE, GREEN, RED, YELLOW, BLACK;
	
	public String toString() {
		return this.name().toLowerCase();
	}
}
