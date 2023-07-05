package ui;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
public class FigureRemoval {

	public FigureRemoval() { }
	private Stage stage;
	private Pane root;
	private MainController mController;
	private String fxmlDocPath = "./src/main/java/ui/FigureRemoval.fxml";

	public Stage getStage() { return stage; }
	public Pane getPane() { return root; }
	public MainController getMainController() { return mController; }

	public void start(MainController mController) throws IOException {
		this.mController = mController;
		stage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		FigureRemovalController controller = new FigureRemovalController(this);
		loader.setController(controller);
		root = (Pane) loader.load(fxmlStream);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Remove Figure");
		stage.show();
		controller.setDataToCombo();
	}

	public void onDestroy() {
		stage.close();
	}
}