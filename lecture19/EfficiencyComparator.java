package comp110.lecture19;

import java.util.Comparator;

public class EfficiencyComparator implements Comparator<Player> {

	// CONSTANTS!
	public static final int A_BEFORE_B = -1;
	public static final int DOESNTMATTER = 0;
	public static final int A_AFTER_B = 1;

	public static final int ASCENDING = 1;
	public static final int FLIP = -1;

	private int _order;

	public EfficiencyComparator() {
		_order = ASCENDING;
	}

	public int compare(Player a, Player b) {
		_order = _order * FLIP;
		if (a.efficiency() > b.efficiency()) {
			return A_BEFORE_B * _order;
		} else if (a.efficiency() == b.efficiency()) {
			return DOESNTMATTER * _order;
		} else {
			return A_AFTER_B * _order;
		}
	}
}
