package comp110.chat.tools;

import java.io.IOException;
import comp110.chat.packets.Connection;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PacketToolWindow {
	public PacketToolWindow(Connection connection) {
		try {
			PacketToolController controller = new PacketToolController(connection);
			String viewFile = "PacketToolView.fxml";
			String windowTitle = "Packet Tool";

			// Setup the View's FXML Loader
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource(viewFile));
			loader.setController(controller);

			// Show the window
			Stage stage = new Stage();
			stage.setScene(new Scene(loader.load()));
			stage.setTitle(windowTitle);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}