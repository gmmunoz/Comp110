package comp110.lecture20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comp110.lecture19.Player;
import comp110.lecture19.RosterLoader;

public class AnimatedSortRunner {

	public static void main(String[] args) {

		// Setup the Team List
		List<Player> team = new ArrayList<Player>();
		RosterLoader rosterLoader = new RosterLoader();
		rosterLoader.load(team);
		team.add(new Player("Maye", 20, 17));

		// Setup the Animation object
		Animation animation = new Animation(team);

		// Construct our Animated Sort Algo
		AnimatedInsertionSortAlgorithm algo = new AnimatedInsertionSortAlgorithm(team, animation);

		// Choose our Comparator
		Comparator<Player> comparator = new EfficiencyComparator();

		// Insertion Sort!
		algo.sort(comparator);

	}

}