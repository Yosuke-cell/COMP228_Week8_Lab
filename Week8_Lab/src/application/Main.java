package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		// header
		Label title = new Label("College Student Registration");
		title.setStyle("-fx-font-size: 30px;");
		
		HBox header = new HBox(12, title);
		header.setAlignment(Pos.CENTER);
		header.setPadding(new Insets(15));
		header.setStyle("-fx-background-color: #336699;");
		
		// navigation
		Label menuTitle = new Label("Menu");
		menuTitle.setStyle("-fx-font-weight: bold;");
		Button dashboard = new Button("Dashboard");
		Button registration = new Button("Registration");
		Button courses = new Button("Courses");
		Button help = new Button("Help");

		VBox navigation = new VBox(12, menuTitle, dashboard, registration, courses, help);
		navigation.setPadding(new Insets(15));
		navigation.setPrefWidth(160);
		navigation.setStyle("-fx-background-color: #d6dde5;");

		//center components
		GridPane form = new GridPane();
		form.setAlignment(Pos.CENTER);
		form.setPadding(new Insets(12,13,14,15));

		form.setHgap(6.5);
		form.setVgap(6.5);
		
		TextField studentidfield = new TextField();
		TextField fullnamefield = new TextField();
		TextField emailfield = new TextField();
		TextField programfield = new TextField();
		Label status = new Label();
		
		Label formname = new Label("Register Form");
		formname.setStyle("-fx-font-weight: bold;");
		form.add(formname, 0,0,2,1);
		
		form.add(new Label("Student ID:"), 0, 1);
		form.add(studentidfield, 1, 1);
		form.add(new Label("Full Name:"), 0, 2);
		form.add(fullnamefield, 1, 2);
		form.add(new Label("Email:"), 0, 3);
		form.add(emailfield, 1, 3);
		form.add(new Label("Program:"), 0, 4);
		form.add(programfield, 1, 4);
			
		studentidfield.setPrefSize(200, 20);  
		fullnamefield.setPrefSize(200, 20);
		emailfield.setPrefSize(200, 20);
		programfield.setPrefSize(200, 20);
	

		Button register = new Button("Register");
		Button clear = new Button("Clear");
		
		HBox actions = new HBox(10, register, clear);
		actions.setAlignment(Pos.CENTER);
		RegisterHandle handler1 = new RegisterHandle(studentidfield, fullnamefield, emailfield, programfield, status);
		register.setOnAction(handler1);
		ClearHandle handler2 = new ClearHandle(studentidfield, fullnamefield, emailfield, programfield, status);
		clear.setOnAction(handler2);
		
		VBox mainContent = new VBox(15, form, actions, status);
		mainContent.setPadding(new Insets(20));
		mainContent.setSpacing(12);
		mainContent.setAlignment(Pos.CENTER);
		
		BorderPane root = new BorderPane();
		root.setTop(header);
		root.setLeft(navigation);
		root.setCenter(mainContent);
		

		Scene scene = new Scene(root, 650, 400);
		primaryStage.setTitle("Student Registration"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}

	}
