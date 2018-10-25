package comp110.lecture19;

import java.util.Comparator;

public class NameComparator implements Comparator<Player> {

	public int compare(Player playerA, Player playerB) {

		String a = playerA.getName();
		String b = playerB.getName();

		/*
		 * The String class has a compareTo method which will return:
		 * 
		 * -1 if the String the method is called on comes lexicographically
		 * before the String argument.
		 * 
		 * 0 if it could go either way
		 * 
		 * 1 if the String the method is called on comes lexicographically after
		 * the String argument.
		 */
		return a.compareTo(b);
	}

}