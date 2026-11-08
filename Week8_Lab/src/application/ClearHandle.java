package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClearHandle implements EventHandler<ActionEvent>{

	private TextField studentidfield;
	private TextField fullnamefield;
	private TextField emailfield;
	private TextField programfield;
	private Label status;
	
	public ClearHandle(TextField studentidfield, TextField fullnamefield, TextField emailfield, TextField programfield, Label status) {
		this.studentidfield = studentidfield;
		this.fullnamefield = fullnamefield;
		this.emailfield = emailfield;
		this.programfield = programfield;
		this.status = status;
	}
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		studentidfield.clear();
		fullnamefield.clear();
		emailfield.clear();
		programfield.clear();
		status.setText("");
		
	}

}
