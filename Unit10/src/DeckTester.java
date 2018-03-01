/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] r = {"Eric", "Me", "Chek"};
		String [] s = {"Black", "White"};
		int [] v = {3, 2, 1};
		Deck d = new Deck(r, s, v);
		System.out.println(d);
		String[] rr = {"A", "AB", "B", "O"};
		String [] ss = {"Red", "Blue", "Black"};
		int[] vv = {11, 111, 1111, 11111};
		Deck dd = new Deck(rr, ss, vv);
		System.out.println(dd);
		String [] rrr = {"F", "M"};
		String [] sss = {"White", "Yellow", "Black"};
		int[] vvv = {2, 1};
		Deck ddd = new Deck(rrr, sss, vvv);
		System.out.println(ddd);
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Spade", "Heart", "Diamond", "Clubs"};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck standard = new Deck(rank, suit, value);
		System.out.println(standard);
		standard.shuffle();
		System.out.println(standard);
	}
}
