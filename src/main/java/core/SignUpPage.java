package core;

import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
	public static void validate(WebDriver driver, String url) {
		
		TestLogic.open(url);
////		int i = 0;
//
//		    for (String key : ObjectStorage.getList().keySet()) {
////			if (i == 42) {
////			    return;
////			} else {
//			    TestLogic.validateElem(key, ObjectStorage.);
////
////			    i++;
////			}
//			System.out.println(key);
//		    }
		TestLogic.validateElem("dynQuotes", ObjectStorage.dynQuotes);
		
		TestLogic.validateElem("curLoc", ObjectStorage.curLoc);
		TestLogic.validateElem("weatherIcon", ObjectStorage.weatherIcon);
		TestLogic.validateElem("temp", ObjectStorage.temp);
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
		TestLogic.validateElem("maleLable", ObjectStorage.maleLable);
		TestLogic.validateElem("maleRadioBtn", ObjectStorage.maleRadioBtn);
		TestLogic.validateElem("femaleLable", ObjectStorage.femaleLable);
		TestLogic.validateElem("femaleRadioBtn", ObjectStorage.femaleRadioBtn);
		TestLogic.validateElem("stateLable", ObjectStorage.stateLable);
		TestLogic.validateElem("stateDropDown", ObjectStorage.stateDropDown);
		TestLogic.validateElem("stateCalItem", ObjectStorage.stateCalItem);
		TestLogic.validateElem("termsLable", ObjectStorage.termsLable);
		TestLogic.validateElem("termsChBox", ObjectStorage.termsChBox);
		TestLogic.validateElem("facebookImage", ObjectStorage.facebookImage);
		TestLogic.validateElem("twitterImage", ObjectStorage.twitterImage);
		TestLogic.validateElem("flickrImage", ObjectStorage.flickrImage);
		TestLogic.validateElem("youtubeImage", ObjectStorage.youtubeImage);
		TestLogic.validateElem("resetbtn", ObjectStorage.resetbtn);
		TestLogic.validateElem("submitBtn", ObjectStorage.submitBtn);
		TestLogic.validateElem("dynTimestamp", ObjectStorage.dynTimestamp);
		TestLogic.validateElem("dynCopyright", ObjectStorage.dynCopyright);
		TestLogic.validateElem("dynOsBrowser", ObjectStorage.dynOsBrowser);
		TestLogic.validateElem("errLine", ObjectStorage.errLine);
		TestLogic.validateElem("fNameErr", ObjectStorage.fNameErr);
		TestLogic.validateElem("lNameErr", ObjectStorage.lNameErr);
		TestLogic.validateElem("emailErr", ObjectStorage.emailErr);
		TestLogic.validateElem("phoneErr", ObjectStorage.phoneErr);
		TestLogic.validateElem("fnameErr", ObjectStorage.fnameErr);
		TestLogic.validateElem("lNameErrImg", ObjectStorage.lNameErrImg);
		TestLogic.validateElem("emailErrImg", ObjectStorage.emailErrImg);
		TestLogic.validateElem("phoneErrImg", ObjectStorage.phoneErrImg);
		
		}
}
