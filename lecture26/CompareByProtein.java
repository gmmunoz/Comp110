package comp110.lecture26;

import java.util.Comparator;

public class CompareByProtein implements Comparator<MenuItem> {

	public int compare(MenuItem a, MenuItem b) {

		// TODO
		if (a.getProtein() > b.getProtein()) {
			return -1;
		} else if (a.getProtein() == b.getProtein()) {
			return 0;
		} else {
			return 1;

		}
	}
}
