package core;

import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectStorage {

    @FindBy(id = "id_quotes")
    static WebElement dynQuotes;
    @FindBy(id = "id_current_location")
    static WebElement curLoc;
    @FindBy(id = "id_weather_icon")
    static WebElement weatherIcon;
    @FindBy(id = "id_temperature")
    static WebElement temp;
    @FindBy(id = "id_f_title")
    static WebElement title;
    @FindBy(id = "id_f_label_fn")
    static WebElement fNameLabel;
    @FindBy(id = "id_fname")
    static WebElement fNameField;
    @FindBy(id = "id_f_label_ln")
    static WebElement lNameLabel;
    @FindBy(id = "id_lname")
    static WebElement lNameField;
    @FindBy(id = "id_f_label_ea")
    static WebElement emailLabel;
    @FindBy(id = "id_email")
    static WebElement emailField;
    @FindBy(id = "id_f_label_pn")
    static WebElement phoneLabel;
    @FindBy(id = "id_phone")
    static WebElement phoneField;
    @FindBy(id = "id_rb_label_g")
    static WebElement genreLable;
    @FindBy(id = "id_rb_label_m")
    static WebElement maleLable;
    @FindBy(id = "id_gender_male")
    static WebElement maleRadioBtn;
    @FindBy(id = "id_rb_label_f")
    static WebElement femaleLable;
    @FindBy(id = "id_gender_female")
    static WebElement femaleRadioBtn;
    @FindBy(id = "id_f_label_s")
    static WebElement stateLable;
    @FindBy(id = "id_state")
    static WebElement stateDropDown;
    @FindBy(xpath = "//*[@id='id_state']/option[6]")
    static WebElement stateCalItem;
    @FindBy(id = "id_cb_label_t")
    static WebElement termsLable;
    @FindBy(id = "id_terms")
    static WebElement termsChBox;
    @FindBy(id = "id_img_facebook")
    static WebElement facebookImage;
    @FindBy(id = "id_img_twitter")
    static WebElement twitterImage;
    @FindBy(id = "id_img_flickr")
    static WebElement flickrImage;
    @FindBy(id = "id_img_youtube")
    static WebElement youtubeImage;
    @FindBy(id = "id_reset_button")
    static WebElement resetbtn;
    @FindBy(id = "id_submit_button")
    static WebElement submitBtn;
    @FindBy(id = "timestamp")
    static WebElement dynTimestamp;
    @FindBy(id = "copyright")
    static WebElement dynCopyright;
    @FindBy(id = "os_browser")
    static WebElement dynOsBrowser;
    @FindBy(id = "ErrorLine")
    static WebElement errLine;
    @FindBy(id = "fname_error")
    static WebElement fNameErr;
    @FindBy(id = "lname_error")
    static WebElement lNameErr;
    @FindBy(id = "email_error")
    static WebElement emailErr;
    @FindBy(id = "phone_error")
    static WebElement phoneErr;
    @FindBy(xpath = "//*[@id='fname_error']/img")
    static WebElement fnameErr;
    @FindBy(xpath = "//*[@id='lname_error']/img")
    static WebElement lNameErrImg;
    @FindBy(xpath = "//*[@id='email_error']/img")
    static WebElement emailErrImg;
    @FindBy(xpath = "//*[@id='phone_error']/img")
    static WebElement phoneErrImg;
    @FindBy(id = "id_gender")
    static WebElement genreField;
    @FindBy(id = "id_back_button")
    static WebElement backBtn;

    private static final TreeMap<String, String> myList = createMap();

    public static String getMylist(Object key) {
	return myList.get(key);
    }

    public static TreeMap<String, String> getList() {
   	return myList;
       }
    

    
    
    
    private static TreeMap<String, String> createMap() {
	TreeMap<String, String> myList = new TreeMap<String, String>();
	myList.put("dynQuotes", "01. Element [Quotes (dynamic)]: ");
	myList.put("curLoc", "02. Element [Current Location]: ");
	myList.put("weatherIcon", "03. Element [Weather Icon]: ");
	myList.put("temp", "04. Element [Temperature]: ");
	myList.put("title", "05. Element [Title]: ");
	myList.put("fNameLabel", "06. Element [First Name (label)]: ");
	myList.put("fNameField", "07. Element [First Name (field)]: ");
	myList.put("lNameLabel", "08. Element [Last Name (label)]: ");
	myList.put("lNameField", "09. Element [Last Name (field)]: ");
	myList.put("emailLabel", "10. Element [Email (label)]: ");
	myList.put("emailField", "11. Element [Email (filed)]: ");
	myList.put("phoneLabel", "12. Element [Phone (label)]: ");
	myList.put("phoneField", "13. Element [Phone (field)]: ");
	myList.put("genreLable", "14. Element [Genre (label)]: ");
	myList.put("maleLable", "15. Element [Male (label)]: ");
	myList.put("maleRadioBtn", "16. Element [Male (radio button)]: ");
	myList.put("femaleLable", "17. Element [Female (label)]: ");
	myList.put("femaleRadioBtn", "18. Element [Female (radio button)]: ");
	myList.put("stateLable", "19. Element [State (label)]: ");
	myList.put("stateDropDown", "20. Element [State (drop-down)]: ");
	myList.put("stateCalItem", "21. Element [State California (item)]: ");
	myList.put("termsLable", "22. Element [Terms (label)]: ");
	myList.put("termsChBox", "23. Element [Terms (checkbox)]: ");
	myList.put("facebookImage", "24. Element [Image (facebook)]: ");
	myList.put("twitterImage", "25. Element [Image (twitter)]: ");
	myList.put("flickrImage", "26. Element [Image (flickr)]: ");
	myList.put("youtubeImage", "27. Element [Image (youtube)]: ");
	myList.put("resetbtn", "28. Element [Reset (button)]: ");
	myList.put("submitBtn", "29. Element [Submit (button)]: ");
	myList.put("dynTimestamp", "30. Element [Timestamp (dynamic)]: ");
	myList.put("dynCopyright", "31. Element [Copyright (dynamic)]: ");
	myList.put("dynOsBrowser", "32. Element [OS & Browser (dynamic)]: ");
	myList.put("errLine", "33. Element [Error Line]: ");
	myList.put("fNameErr", "34. Element [First Name Error]: ");
	myList.put("lNameErr", "35. Element [Last Name Error]: ");
	myList.put("emailErr", "36. Element [Email Error]: ");
	myList.put("phoneErr", "37. Element [Phone Error]: ");
	myList.put("fnameErr", "38. Element [First Name Error (img)]: ");
	myList.put("lNameErrImg", "39. Element [Last Name Error (img)]: ");
	myList.put("emailErrImg", "40. Element [Email Error (img)]: ");
	myList.put("phoneErrImg", "41. Element [Phone Error (img)]: ");
	myList.put("genreField", "42. Element [Genrge (field)): ");
	myList.put("backBtn", "43. Element [Back (button)]: ");

	return myList;
    }
}
