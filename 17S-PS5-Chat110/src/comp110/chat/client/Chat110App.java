package comp110.chat.client;

import comp110.chat.packets.Connection;
import comp110.chat.packets.Packet;
import comp110.chat.tools.PacketToolWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class Chat110App extends Application {

	public static void main(String[] args) {
		Application.launch();
	}

	public void start(Stage stage) throws Exception {

		Connection connection = new Connection();
		connection.connect("ws://comp110.com/chat110");

		// TODO: Once our app is working, we'll remove this
		// PacketToolWindow packets = new PacketToolWindow(connection);

		// TODO: Construct the Coordinator
		Coordinator cord = new Coordinator(connection);
		connection.send(new Packet("auth:gmmunoz:2c87ecea33c250d5"));
	}
}
