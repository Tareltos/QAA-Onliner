package pages;


import utils.Screenshoter;

import java.io.IOException;

public class CatalogPage extends AbstractPage {

    private static final String CATALOG_PAGE_URL = "https://catalog.onliner.by/";


    public CatalogPage() throws IOException {
    }

    public CatalogPage open() {
        driver.get(CATALOG_PAGE_URL);
        Screenshoter.takeScreenshot();
        return this;
    }

}
