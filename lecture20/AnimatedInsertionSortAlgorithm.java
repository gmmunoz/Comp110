package comp110.lecture20;

import java.util.Comparator;
import java.util.List;

import comp110.lecture19.Player;

public class AnimatedInsertionSortAlgorithm {

	// Constants
	public static final int B_BEFORE_A = 1;

	// Fields
	private List<Player> _list;
	private Comparator<Player> _comparator;
	private Animation _animation;

	// Constructor
	public AnimatedInsertionSortAlgorithm(List<Player> list, Animation animation) {
		_list = list;
		_animation = animation;
	}

	// Methods
	public void sort(Comparator<Player> comparator) {
		_comparator = comparator;
		for (int next = 0; next < _list.size(); next++) {
			int current = next;
			// NOTE! We're animating each time we move to the next Player
			_animation.animate(current);

			while (this.shouldMoveBack(current)) {
				this.moveBack(current);
				current--;
				// NOTE! We're animating each time we move back!
				_animation.animate(current);
			}
		}
	}

	// Private "Helper" Methods Follow
	// These are for "internal use only"

	/**
	 * Given an index i, compared with the Player at index i - 1, are the two
	 * Player objects correctly ordered?
	 * 
	 * Use _comparator to compare Players at index i and i - 1 and determine if
	 * the Player at index i should move back.
	 */

	private boolean shouldMoveBack(int i) {
		// TODO
		// Test if index i can be moved back
		// Yes?
		// -- Should i - 1 come after i? Yes? return true! No? return false!
		// No?
		// -- return false!
		if (this.canMoveBack(i)) {
			Player a = _list.get(i - 1);
			Player b = _list.get(i);
			return _comparator.compare(a, b) >= B_BEFORE_A;
		} else {
			return false;
		}
	}

	/**
	 * Could index i be swapped with index i - 1?
	 * 
	 * What must be true about the index i - 1?
	 */
	private boolean canMoveBack(int i) {
		// TODO
		return i - 1 >= 0;
	}

	/**
	 * Given an index i, swap Player at index i with Player at index i - i
	 */
	private void moveBack(int i) {
		// TODO
		Player temp = _list.get(i);
		_list.set(i, _list.get(i - 1));
		_list.set(i - 1, temp);
	}

}