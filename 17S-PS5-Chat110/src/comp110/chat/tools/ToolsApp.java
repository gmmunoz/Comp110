package comp110.chat.tools;

import comp110.chat.packets.Connection;
import comp110.chat.packets.Packet;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Author: <Gabriela Munoz>
 *
 * ONYEN: <gmmunoz>
 *
 * UNC Honor Pledge: I certify that no unauthorized aids or assistance has been
 * received or used in the completion of this work. I collaborated with no one
 * other than official COMP110 UTAs on this code.
 */
public class ToolsApp extends Application {

	/**
	 * The main method in a JavaFX app simply "launches" the JavaFX platform.
	 * Magic happens. Then your app's start method is called and this is where
	 * your code begins.
	 */
	public static void main(String[] args) {
		Application.launch();
	}

	/**
	 * The start method is the beginning of our JavaFX app.
	 */
	public void start(Stage stage) throws Exception {

		// TODO: Construct a Connection to the server
		Connection connection = new Connection();
		connection.connect("ws://comp110.com/chat110");

		// TODO: Construct a PacketToolWindow
		PacketToolWindow PacketToolWindow = new PacketToolWindow(connection);

		// TODO: Send an auth packet to automatically authenticate on startup
		connection.send(new Packet("auth:gmmunoz:2c87ecea33c250d5"));

	}

}