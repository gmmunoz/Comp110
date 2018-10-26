package comp110.chat.client;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import java.util.List;
import javafx.scene.input.MouseEvent;

public class FriendsController {
	@FXML
	private ListView<String> _friends;
	private Coordinator _coordinator;

	public void update(List<String> friends) {
		List<String> viewList = _friends.getItems();
		viewList.clear();
		// TODO: Loop through each element in the friends parameter and add each
		// to viewList
		for (int i = 0; i < friends.size(); i++) {
			viewList.add(friends.get(i));
		}
	}

	public FriendsController(Coordinator cord) {
		_coordinator = cord;

	}

	public void refresh() {
		_coordinator.refresh();
	}

	public void handleFriendClick(MouseEvent event) {
		if (event.getClickCount() == 2) {
			String onyen = _friends.getSelectionModel().getSelectedItem();
			_coordinator.showChatWindow(onyen);
		}
	}
}