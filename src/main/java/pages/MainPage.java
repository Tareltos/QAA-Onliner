package pages;


import entity.User;
import loaders.LoaderUserDatailsFromExcel;
import org.openqa.selenium.By;
import utils.Screenshoter;
import java.io.IOException;


public class MainPage extends AbstractPage {
    private User user = LoaderUserDatailsFromExcel.loadFromExcel("src/main/resources/UserInfo.xlsx");
    private static final String MAIN_URL = "https://www.onliner.by/";

    private static final By INPUT_BUTTON_LOCATOR = By.xpath("//*[@id=\"userbar\"]/div/div[1]");
    private static final By LOGIN_FORM_LOCATOR = By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[1]/input");
    private static final By PASSWORD_FORM_LOCATOR = By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[2]/input");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[3]/div/button");

    public MainPage() throws IOException {
    }

    public MainPage open() {
        driver.get(MAIN_URL);
        Screenshoter.takeScreenshot();
        return this;
    }

    public void findloginForm(){
        highlightElement(INPUT_BUTTON_LOCATOR);
        Screenshoter.takeScreenshot();
        unHighlightElement(INPUT_BUTTON_LOCATOR);
        driver.findElement(INPUT_BUTTON_LOCATOR).click();

    }


    public void logIn(){
        highlightElement(LOGIN_FORM_LOCATOR);
        highlightElement(PASSWORD_FORM_LOCATOR);
        highlightElement(LOGIN_BUTTON_LOCATOR);
        Screenshoter.takeScreenshot();
        driver.findElement(LOGIN_FORM_LOCATOR).sendKeys(user.getMail());
        driver.findElement(PASSWORD_FORM_LOCATOR).sendKeys(user.getPassword());
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();

    }



}
