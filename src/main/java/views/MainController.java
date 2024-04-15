package views;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import models.MainModel;
import models.ViewTransitionModelInterface;


public class MainController {
	ViewTransitionModelInterface model;
	@FXML 
	void onClickJobs(ActionEvent event) {
		model.showJobs();
		System.out.println("Job Cliked");
	}
	
	@FXML 
	void onClickNews(ActionEvent event) {
		model.showNews();
		System.out.println("News Clicked");
	}
	
	@FXML 
	void onClickProfiles(ActionEvent event) {
		model.showProfiles();
		System.out.println("Profiles Clicked");
	}
	
	@FXML
	void onClickSave(ActionEvent event) {
		System.out.println("Saved");
	}
	
	@FXML
	void onClickLike(ActionEvent event) {
		System.out.println("Liked");
	}
	
	@FXML
	void onClickEdit(ActionEvent event) {
		System.out.println("Edited");
	}

	public void setModel(ViewTransitionModelInterface newModel) {
		model = newModel;
		
	}

}

