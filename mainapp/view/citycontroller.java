package mainapp.view;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import mainapp.MainApp;

public class citycontroller {
	@FXML
	private TableView<city> cityTable;
	private MainApp mainApp;

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		citytable.setItems(mainApp.getCityData());
	}

}
