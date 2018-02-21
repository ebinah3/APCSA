/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c = new Card("Jack", "Spade", 11);
		System.out.println(c);
		System.out.println(c.suit());
		System.out.println(c.rank());
		System.out.println(c.pointValue());
	}
}