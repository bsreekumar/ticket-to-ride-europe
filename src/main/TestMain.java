/**
 * 
 */
package main;

/**
 * @author bsreekumar
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testPlayerColor();
	}
	
	private static void testPlayerColor() {
		for (PlayerColor c : PlayerColor.values()) System.out.println(c);
	}

}
