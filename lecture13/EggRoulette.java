package comp110.lecture13;

import java.util.Random;

import javafx.scene.Group;

public class EggRoulette {

	private Carton _carton;
	private int[] _scores;
	private int _turn;

	public EggRoulette(int players) {
		_scores = new int[players];
		_turn = 0;

		// TODO #1: Initialize our _carton Field
		_carton = new Carton();

		// Boil 3 / 4 of the eggs
		for (int i = _carton.size() / 3; i < _carton.size(); i++) {
			Egg selected = _carton.takeEgg(i);
			selected.boil();
			_carton.setEgg(i, selected);
		}

		// Shuffle our Eggs
		this.shuffleEggs();

	}

	public void shuffleEggs() {
		Random random = new Random();
		for (int i = 0; i < _carton.size(); i++) {
			int a = random.nextInt(_carton.size());
			int b = random.nextInt(_carton.size());
			// TODO: Swap the eggs at indices a and b
			// Hint: You will need a temporary variable
			// Make use of:
			// 1. _carton.takeEgg( <index> )
			// 2. _carton.setEgg( <index>, <Egg> )
			Egg temp = _carton.takeEgg(a);
			_carton.setEgg(a, takeEgg(b));
			_carton.setEgg(b, temp);
		}
	}

	private Egg takeEgg(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	public Egg pick(int index) {
		Egg selected = _carton.takeEgg(index);
		if (selected != null) {
			if (selected.isRaw()) {
				_scores[this.getPlayer()]++;
			}
		}
		_turn++;
		return selected;
	}

	public int getPlayer() {
		return _turn % _scores.length;
	}

	public boolean isGameOver() {

		if (_carton.remaining() <= 0) {
			return true;
		}

		for (int i = 0; i < _scores.length; i++) {
			if (_scores[i] >= 2) {
				return true;
			}
		}
		return false;
	}

	public int getLoser() {
		for (int i = 0; i < _scores.length; i++) {
			if (_scores[i] >= 2) {
				return i;
			}
		}
		return -1;
	}

	public Group getShapes() {
		return _carton.getShapes();
	}

}
