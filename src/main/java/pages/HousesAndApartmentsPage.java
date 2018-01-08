package pages;


import utils.Screenshoter;

import java.io.IOException;

public class HousesAndApartmentsPage extends AbstractPage {

    private static final String HOUSE_AND_APP_URL = "https://r.onliner.by/pk/";

    public HousesAndApartmentsPage() throws IOException {
    }

    public HousesAndApartmentsPage open() {
        driver.get(HOUSE_AND_APP_URL);
        Screenshoter.takeScreenshot();
        return this;
    }

}
