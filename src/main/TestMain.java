package main;

public class TestMain {
	public static void main(String[] args) {
		
		testPlayerColor();
		testTrainCarColor();
		testCityName();
		testPlayer();
	}
	
	private static void testPlayerColor() {
		for (PlayerColor c : PlayerColor.values()) System.out.println(c);
	}
	
	private static void testTrainCarColor() {
		for (TrainCarColor c : TrainCarColor.values()) System.out.println(c);
	}
	private static void testCityName() {
		for (CityName n : CityName.values()) System.out.println(n);
	}
	
	private static void testPlayer() {
		Player player = new Player(PlayerColor.BLACK);
		System.out.println("" + player.getColor() + 
				"\t" + player.getNumOfStations() + 
				"\t" + player.getNumOfTrainCars());
	}
}
