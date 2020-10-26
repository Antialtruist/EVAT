package pages;

import java.time.LocalDate;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditYourProfilePage {

	private WebDriver driver;
	
	public EditYourProfilePage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Change Avatar')]")
	WebElement changeAvatarField;
	
	@FindBy(xpath = "//*[@id=\"panel1bh-content\"]/div/p/form/div[1]/div/div/img")
	WebElement occupiedAvatarField;
	
	@FindBy(xpath = "//*[@id=\"panel1bh-content\"]/div/p/form/button/span[1]")
	WebElement clearAvatarButton;
	
	@FindBy(xpath = "//*[@id=\"panel1bh-content\"]/div/p/form/div[2]/button/span[1]")
	WebElement submitAvatarButton;
	
	@FindBy(xpath = "//*[@id=\"panel1bh-content\"]/div/p/form/div[1]/div/input")
	WebElement uploaderAvatarComponent;
	
	@FindBy(xpath = "//p[contains(text(),'Username')]")
	WebElement usernameField;
	
	@FindBy(xpath = "//*[@id=\"panel1bh-content\"]/div/p/form/div[1]/div/div/input")
	WebElement inputUsernameComponent;
	
	@FindBy(css = "#panel1bh-content > div > p > form > div:nth-child(2) > button:nth-child(1) > span.MuiButton-label")
	WebElement submitUsernameButton;
	
	@FindBy(xpath = "//p[contains(text(),'Gender')]")
	WebElement genderField;
	
	@FindBy(xpath = "//body/div[@id='root']/div[@id='main']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement chooseGenderDropDownList;
	
	@FindBy(xpath = "//div[contains(text(),'Male')]")
	WebElement maleGender;
	
	@FindBy(xpath = "//div[contains(text(),'Female')]")
	WebElement femaleGender;
	
	@FindBy(xpath = "//div[contains(text(),'Other')]")
	WebElement otherGender;
	
	@FindBy(xpath = "//*[@id=\"panel2bh-content\"]/div/p/form/div[2]/button/span[1]")
	WebElement submitGenderButton;
	
	@FindBy(xpath = "//p[contains(text(),'Date of birth')]")
	WebElement dateOfBirthField;
	
	@FindBy(xpath = "//*[@id=\"panel3bh-content\"]/div/p/form/div[1]/div/div/input")
	WebElement inputDateOfBirthComponent;
	
	@FindBy(xpath = "//*[@id=\"panel3bh-content\"]/div/p/form/div[2]/button[1]/span[1]")
	WebElement submitDateOfBirthButton;
	
	@FindBy(xpath = "//p[contains(text(),'Favorite Categories')]")
	WebElement favoriteCategoriesField;
	
	@FindBy(xpath = "//*[@id=\"panel4bh-content\"]/div/p/div/form/div[1]/div[1]")
	WebElement favoriteCategoriesDropDownList;
	
	@FindBy(xpath = "//*[@id=\"panel4bh-content\"]/div")
	WebElement emptyFieldFavoriteCategories;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox_active_option\"]")
	WebElement seaCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[2]")
	WebElement mountCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[3]")
	WebElement summerCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[4]")
	WebElement golfCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[5]")
	WebElement teamBuildingCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[6]")
	WebElement swimmingCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[7]")
	WebElement gamingCategory;
	
	@FindBy(xpath = "//*[@id=\"rw_3_listbox\"]/li[8]")
	WebElement travelCategory;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement favoriteCategoriesSaveButton;
	
	@FindBy(xpath = "//p[contains(text(),'ChangePassword')]")
	WebElement changePasswordField;
	
	@FindBy(name = "oldPassword")
	WebElement inputCurrentPasswordComponent;
	
	@FindBy(name = "newPassword")
	WebElement inputNewPasswordComponent;
	
	@FindBy(name = "repeatPassword")
	WebElement repeatNewPasswordComponent;
	
	@FindBy(css = "#panel1bh-content > div > p > form > div.mt-2 > button.MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary > span.MuiButton-label")
	WebElement submitChangePasswordButton;
	
	public void clickOnChangeAvatarField() {
		changeAvatarField.click();
	}
	
	public void clickOnClearAvatarButton() {
		clearAvatarButton.click();
	}
	
	public void clickOnSubmitAvatarButton() {
		submitAvatarButton.click();
	}
	
	public void loadAvatar(String imagePath) {
		uploaderAvatarComponent.sendKeys(imagePath);
	}
	
	public void changeAvatar(String imagePath) {
		clickOnChangeAvatarField();
		// if avatar exists
		if (occupiedAvatarField.isEnabled()) {
			clickOnClearAvatarButton();
		}
		loadAvatar(imagePath);
		clickOnSubmitAvatarButton();
	}
	
	public void clickOnUsernameField() {
		usernameField.click();
	}
	
	public void setUsernameIntoInputComponent(String name) {
		inputUsernameComponent.sendKeys(name);
	}
	
	public void clickOnSubmitUsernameButton() {
		submitUsernameButton.click();
	}
	
	public void changeUserName(String name) {
		clickOnUsernameField();
		setUsernameIntoInputComponent(name);
		clickOnSubmitUsernameButton();
	}
	
	public void clickOnGenderField() {
		genderField.click();
	}
	
	public void clickOnChooseGenderDropDownList() {
		chooseGenderDropDownList.click();
	}
	
	public void clickOnSubmitGenderButton() {
		submitGenderButton.click();
	}
	
	public void chooseGender(String gender) {
		clickOnGenderField();
		clickOnChooseGenderDropDownList();

		switch (gender) {
		case ("Male"):
			maleGender.click();
			break;
		case ("Female"):
			femaleGender.click();
			break;
		case ("Other"):
			otherGender.click();
			break;
		}

		clickOnSubmitGenderButton();
	}
	
	public void clickOnDateOfBirthField() {
		dateOfBirthField.click();
	}
	
	public void clickOnInputDateOfBirthComponent() {
		inputDateOfBirthComponent.click();
	}
	
	public void clickOnSubmitDateOfBirthButton() {
		submitDateOfBirthButton.click();
	}
	
	public void setDateOfBirth(LocalDate date) {
		clickOnDateOfBirthField();
		inputDateOfBirthComponent.sendKeys(Keys.CONTROL + "a");
		inputDateOfBirthComponent.sendKeys(Keys.DELETE);
		inputDateOfBirthComponent.sendKeys(date.getMonth() + "/" + date.getDayOfMonth() + "/" + date.getYear());
		inputDateOfBirthComponent.sendKeys(Keys.ENTER);
		clickOnSubmitDateOfBirthButton();
	}
	
	public void clickOnFavoriteCategoriesField() {
		favoriteCategoriesField.click();
	}
	
	public void clickOnFavoriteCategoriesDropDownList() {
		favoriteCategoriesDropDownList.click();
	}
	
	public void clickOnEmptyFieldFavoriteCategories() {
		emptyFieldFavoriteCategories.click();
	}
	
	public void clickOnFavoriteCategoriesSaveButton() {
		favoriteCategoriesSaveButton.click();
	}
	
	public void chooseFavoriteCategories(String category) {
		clickOnFavoriteCategoriesField();
		clickOnFavoriteCategoriesDropDownList();

		switch (category) {
		case ("Sea"):
			seaCategory.click();
			break;
		case ("Mount"):
			mountCategory.click();
			break;
		case ("Summer"):
			summerCategory.click();
			break;
		case ("Golf"):
			golfCategory.click();
			break;
		case ("Team-Building"):
			teamBuildingCategory.click();
			break;
		case ("Swimming"):
			swimmingCategory.click();
			break;
		case ("Gaming"):
			gamingCategory.click();
			break;
		case ("Travel"):
			travelCategory.click();
			break;
		}

		clickOnEmptyFieldFavoriteCategories();
		clickOnFavoriteCategoriesSaveButton();
	}
	
	public void clickOnChangePasswordField() {
		changePasswordField.click();
	}
	
	public void setCurrentPasswordComponent(String currentPassword) {
		inputCurrentPasswordComponent.sendKeys(currentPassword);
	}
	
	public void setNewPasswordComponent(String newPassword) {
		inputNewPasswordComponent.sendKeys(newPassword);
	}
	
	public void setRepeatNewPasswordComponent(String repNewPassword) {
		repeatNewPasswordComponent.sendKeys(repNewPassword);
	}
	
	public void clickOnSubmitChangePasswordButton() {
		submitChangePasswordButton.click();
	}
	
	public void changePassword (String currentPassword, String newPassword, String repNewPassword) {
		clickOnChangePasswordField();
		setCurrentPasswordComponent(currentPassword);
		setNewPasswordComponent(newPassword);
		setRepeatNewPasswordComponent(repNewPassword);
		clickOnSubmitChangePasswordButton();
	}
}
