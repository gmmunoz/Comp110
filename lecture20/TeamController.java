package comp110.lecture20;

import java.util.Comparator;
import java.util.List;

import comp110.lecture19.NameComparator;
import comp110.lecture19.Player;
import comp110.lecture19.PointsComparator;
import comp110.lecture19.RosterLoader;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TeamController {

	// Control Fields
	@FXML
	private ListView<Player> _playersListView;

	// Fields
	private List<Player> _players;

	private InsertionSortAlgorithm _sortAlgo;

	// JavaFX calls the initialize method after View is bound to Controller
	public void initialize() {
		_players = _playersListView.getItems();
		_sortAlgo = new InsertionSortAlgorithm(_players);

		// Let's go ahead and add players from the start
		RosterLoader loader = new RosterLoader();
		loader.load(_players);
		_players.add(new Player("Maye", 20, 17));
	}

	public void loadTeam() {
		RosterLoader rosterLoader = new RosterLoader();
		rosterLoader.load(_players);
	}

	public void addLuke() {
		_players.add(new Player("Maye", 20, 17));
	}

	public void remove() {
		Player selected = _playersListView.getSelectionModel().getSelectedItem();
		_players.remove(selected);
	}

	public void sortPoints() {
		_sortAlgo.sort(new PointsComparator());
	}

	public void sortName() {
		_sortAlgo.sort(new NameComparator());
	}

	public void sortEfficiency() {
		_sortAlgo.sort(new EfficiencyComparator());
	}

}