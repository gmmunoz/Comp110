package comp110.chat.tools;

import comp110.chat.packets.ConnectionObserver;
import comp110.chat.packets.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import comp110.chat.packets.Connection;

public class PacketToolController implements ConnectionObserver {
	private Connection _connection;
	@FXML
	private TextField _packetField;
	@FXML
	private ListView<Packet> _sent, _received;

	public PacketToolController(Connection connection) {
		_connection = connection;
		_connection.addObserver(this);

	}

	public void send() {
		Packet packet = new Packet(_packetField.getText()); // Construct a
															// packet from the
															// text field's text
		_packetField.setText(""); // Clear the text field
		_connection.send(packet); // Send the packet to the server
	}

	public void packetSent(Packet packet) {
		_sent.getItems().add(packet); // Add the packet to the _sent ListView's
										// items
		_sent.scrollTo(packet); // Scroll to it (once the list gets long)
	}

	public void packetReceived(Packet packet) {
		_received.getItems().add(packet);
		_received.scrollTo(packet);
	}

}
