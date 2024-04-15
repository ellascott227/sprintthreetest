package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ViewTransitionModel implements ViewTransitionModelInterface {
	BorderPane mainview;
	
	public ViewTransitionModel(BorderPane view) {
		mainview = view;
	}
	
	@Override
	public void showJobs() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/jobsview.fxml"));
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void showProfiles() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/profileview.fxml"));
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void showNews() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/newsview.fxml"));
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
