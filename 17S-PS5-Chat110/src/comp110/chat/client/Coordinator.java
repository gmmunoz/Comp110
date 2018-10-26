package comp110.chat.client;

import comp110.chat.packets.Connection;
import comp110.chat.packets.ConnectionObserver;
import comp110.chat.packets.Packet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Coordinator implements ConnectionObserver {
	private Connection _connection;
	private FriendsWindow _friends;
	private Map<String, ChatWindow> _chats;

	public void packetSent(Packet packet) {
		System.out.println("Coordinator: packetSent");
		if (packet.getType().equals(DM)) {
			handleDMSent(packet);
		}
	}

	public void packetReceived(Packet packet) {
		if (packet.getType().equals(WHO)) {
			handleWho(packet);
		} else if (packet.getType().equals(DM)) {
			handleDMReceived(packet);
		}
	}

	public Coordinator(Connection connection) {
		_connection = connection;
		_connection.addObserver(this);
		_friends = new FriendsWindow(this);
		_chats = new HashMap<String, ChatWindow>();
		ChatWindow chat = this.getChatWindow("gmmunoz");
		chat.addHistory("You: hello, world");
	}

	public static final String WHO = "who";

	private void handleWho(Packet packet) {
		List<String> onyens = new ArrayList<String>();
		onyens.add("carol");
		onyens.add("krisj");
		_friends.update(onyens);
	}

	public void refresh() {
		_connection.send(new Packet("who"));
	}

	// D.2.3 help
	public void send(String _onyen, String text) {
		_connection.send(new Packet("dm: " + _onyen + text));
	}

	public static final String DM = "dm";

	private void handleDMReceived(Packet packet) {
		String onyen = packet.getParameter(0);
		if (onyen == "dm") {
			String text = packet.join(1);
			this.getChatWindow(onyen).addHistory(onyen + ": " + text);
		}

	}

	private void handleDMSent(Packet packet) {
		String onyen = packet.getParameter(0);
		String text = packet.join(1);
		this.getChatWindow(onyen).addHistory("You: " + text);

	}

	private ChatWindow getChatWindow(String onyen) {
		// get is a method inside of the Map class
		ChatWindow newOnyen = _chats.get(onyen);
		if (newOnyen == null) {
			newOnyen = new ChatWindow(onyen, this);
			// put is a method inside of the Map class

			// void put(<key> nameOfKey, <Value> nameOfValue);
			_chats.put(onyen, newOnyen);
		}
		newOnyen.show();
		return newOnyen;
	}

	public void showChatWindow(String onyen) {
		this.getChatWindow(onyen);
	}

}
