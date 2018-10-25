package comp110.lecture19;

import java.util.Comparator;

public class PointsComparator implements Comparator<Player> {

	public int compare(Player a, Player b) {
		if (a.getPoints() < b.getPoints()) {
			return -1; // A comes before B
		} else if (a.getPoints() == b.getPoints()) {
			return 0; // Either way
		} else {
			return 1; // A comes after B
		}
	}

}