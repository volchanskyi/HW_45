package core;

import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	
	public static void validate(WebDriver driver, String url) {
		
		TestLogic.open(url);
		
		TestLogic.validateElem("title", ObjectStorage.title);
		TestLogic.validateElem("fNameLabel", ObjectStorage.fNameLabel);
		TestLogic.validateElem("fNameField", ObjectStorage.fNameField);
		TestLogic.validateElem("lNameLabel", ObjectStorage.lNameLabel);
		TestLogic.validateElem("lNameField", ObjectStorage.lNameField);
		TestLogic.validateElem("emailLabel", ObjectStorage.emailLabel);
		TestLogic.validateElem("emailField", ObjectStorage.emailField);
		TestLogic.validateElem("phoneLabel", ObjectStorage.phoneLabel);
		TestLogic.validateElem("phoneField", ObjectStorage.phoneField);
		TestLogic.validateElem("genreLable", ObjectStorage.genreLable);
		TestLogic.validateElem("genreField", ObjectStorage.genreField);
		TestLogic.validateElem("backBtn", ObjectStorage.backBtn);
		
		}
}
