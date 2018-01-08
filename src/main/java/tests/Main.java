package tests;


import pages.AutoPage;
import pages.CatalogPage;
import pages.HousesAndApartmentsPage;
import pages.MainPage;
import utils.WebDriverSingleton;

import java.io.IOException;
import java.util.List;

public class Main {



public static void main(String[] args) throws InterruptedException, IOException {
    MainPage mainPage = new MainPage().open();
    AutoPage autoPage = new AutoPage().open();
    CatalogPage catPage = new CatalogPage().open();
    HousesAndApartmentsPage hP = new HousesAndApartmentsPage().open();

    Main.kill();
}




    public static void kill(){
        WebDriverSingleton.kill();
    }

}