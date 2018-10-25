package comp110.lecture20;

import java.util.Comparator;

import comp110.lecture19.Player;

/**
 * Sort by efficiency.
 * 
 * This class is a solution from the previous lecture.
 */
public class EfficiencyComparator implements Comparator<Player> {

	public static final int A_BEFORE_B = -1, EITHER_WAY = 0, A_AFTER_B = 1;

	public int compare(Player a, Player b) {
		if (a.efficiency() > b.efficiency()) {
			return A_BEFORE_B;
		} else if (a.efficiency() == b.efficiency()) {
			return EITHER_WAY;
		} else {
			return A_AFTER_B;
		}
	}

}
