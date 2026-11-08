package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RegisterHandle implements EventHandler<ActionEvent>{

	private TextField studentidfield;
	private TextField fullnamefield;
	private TextField emailfield;
	private TextField programfield;
	private Label status;
	
	public RegisterHandle(TextField studentidfield, TextField fullnamefield, TextField emailfield, TextField programfield, Label status) {
		this.studentidfield = studentidfield;
		this.fullnamefield = fullnamefield;
		this.emailfield = emailfield;
		this.programfield = programfield;
		this.status = status;
	}
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(studentidfield.getText().trim().isEmpty() || 
			fullnamefield.getText().trim().isEmpty() ||
			emailfield.getText().trim().isEmpty() ||
			programfield.getText().trim().isEmpty()) {
			status.setText("Error: Please fill it in.");
			status.setStyle("-fx-text-fill: red;");
		}
		else {
			status.setText("Registered: " + fullnamefield.getText().trim());
			status.setStyle("-fx-text-fill: green;");
		}
	}

}
