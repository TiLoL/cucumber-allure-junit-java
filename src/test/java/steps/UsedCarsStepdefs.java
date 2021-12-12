package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import service.CarService;
import util.Urls;

import java.io.IOException;


public class UsedCarsStepdefs {

    final static String URL_MERCEDES_GLE_W166 = "https://www.avito.ru/moskva/avtomobili/s_probegom/mercedes-benz/gle-klass/w166-20092017-ASgBAgICBESGFMjmAeC2DeiYKOK2DbSmKOq2DcD_KA?cd=1&radius=0";
    Urls carUrls = new Urls();

    @Before
    public void setData(){
        carUrls.setUrls("Mercedes", "GLE", "W166", "Avito", URL_MERCEDES_GLE_W166);
    }


    //todo
    @When("user requests {word} {word} {word} from {word}")
    public void userRequestsMercedesGleFromAvito(String maker, String model, String generation, String resource) throws IOException {
        CarService service = new CarService();
        service.getAd(carUrls.getUrlByCarAndSite(maker, model, generation, resource));
        service.printCars();
    }
}
