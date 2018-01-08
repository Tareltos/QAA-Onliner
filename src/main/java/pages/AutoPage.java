package pages;


import org.openqa.selenium.By;
import utils.Screenshoter;

import java.io.IOException;

public class AutoPage extends AbstractPage {

    private static final String MAIN_URL = "https://ab.onliner.by/";
    private static final By MIN_PRICE_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[1]/div/div[1]/select/option[7]");
    private static final By MAX_PRICE_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[1]/div/div[2]/select/option[8]");
    private static final By COUNTRY_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[4]/div/div[1]/select/option[2]");
    private static final By BRAND_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[6]/div/div[1]/select/option[73]");
    private static final By BRAND2_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[6]/div/div[2]/select/option[13]");
    private static final By TYPE_CAR_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[7]/ul/li[3]/label/input");
    private static final By TYPE_FUIL_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[9]/ul/li[1]/label/input");
    private static final By TYPE_TARNSMITION_LOCATOR = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/form/fieldset[11]/ul/li[1]/label/input");


    public AutoPage() throws IOException {

    }

    public AutoPage open() throws InterruptedException {
        driver.get(MAIN_URL);
        Screenshoter.takeScreenshot();
        Thread.sleep(10000);
        return this;
    }

    public void test() throws InterruptedException {

        driver.findElement(MIN_PRICE_LOCATOR).click();
        driver.findElement(MAX_PRICE_LOCATOR).click();
        driver.findElement(COUNTRY_LOCATOR).click();
        driver.findElement(BRAND_LOCATOR).click();
        driver.findElement(BRAND2_LOCATOR).click();
        driver.findElement(TYPE_CAR_LOCATOR).click();
        driver.findElement(TYPE_FUIL_LOCATOR).click();
        driver.findElement(TYPE_TARNSMITION_LOCATOR).click();
        Screenshoter.takeScreenshot();


    }






}
