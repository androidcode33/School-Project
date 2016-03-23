/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 *
 * @author PAUL
 */
public class regStdController {
 
    
        private Stage dialogStage;
        private StudentsModel person;
        private boolean okClicked = false;
        
       @FXML
    private void initialize() {

    }
    
     public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
     
             	public void setPerson(StudentsModel person) {
		this.person = person;
		
//		firstNameField.setText(person.getFirstName());
//		lastNameField.setText(person.getLastName());
//		streetField.setText(person.getStreet());
//		postalCodeField.setText(Integer.toString(person.getPostalCode()));
//		cityField.setText(person.getCity());
//		birthdayField.setText(CalendarUtil.format(person.getBirthday()));
//		birthdayField.setPromptText("yyyy-mm-dd");
	}
          public boolean isOkClicked() {
		return okClicked;
	}        
          
          //
//    @FXML
//    private void handleOk() {
//        if (isInputValid()) {
//            person.setFirstName(firstNameField.getText());
//            person.setLastName(lastNameField.getText());
//            person.setStreet(streetField.getText());
//            person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
//            person.setCity(cityField.getText());
//            person.setBirthday(CalendarUtil.parse(birthdayField.getText()));
//
//            okClicked = true;
//            dialogStage.close();
//        }
//    }
          
          @FXML
	private void handleCancel() {
		dialogStage.close();
	}
	
	/**
	 * Validates the user input in the text fields.
	 * 
	 * @return true if the input is valid
	 */
//	private boolean isInputValid() {
//		String errorMessage = "";
//
//		if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
//			errorMessage += "No valid first name!\n"; 
//		}
//		if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
//			errorMessage += "No valid last name!\n"; 
//		}
//		if (streetField.getText() == null || streetField.getText().length() == 0) {
//			errorMessage += "No valid street!\n"; 
//		}
//		
//		if (postalCodeField.getText() == null || postalCodeField.getText().length() == 0) {
//			errorMessage += "No valid postal code!\n"; 
//		} else {
//			// try to parse the postal code into an int
//			try {
//				Integer.parseInt(postalCodeField.getText());
//			} catch (NumberFormatException e) {
//				errorMessage += "No valid postal code (must be an integer)!\n"; 
//			}
//		}
//		
//		if (cityField.getText() == null || cityField.getText().length() == 0) {
//			errorMessage += "No valid city!\n"; 
//		}
//		
//		if (birthdayField.getText() == null || birthdayField.getText().length() == 0) {
//			errorMessage += "No valid birthday!\n";
//		} else {
//			if (!CalendarUtil.validString(birthdayField.getText())) {
//				errorMessage += "No valid birthday. Use the format yyyy-mm-dd!\n";
//			}
//		}
//		
//		if (errorMessage.length() == 0) {
//			return true;
//		} else {
//			// Show the error message
//			Dialogs.showErrorDialog(dialogStage, errorMessage,
//					"Please correct invalid fields", "Invalid Fields");
//			return false;
//		}
//	}
}
