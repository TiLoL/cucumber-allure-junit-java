package service;

import objects.UsedCar;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import rest_client.JsoupClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarService {

    final static String PRICE_RU = "цена";
    List<UsedCar> cars = new ArrayList<>();

    public void getAd(String mainUrl) throws IOException {
        JsoupClient client = new JsoupClient();
        Document document = client.getDataByUrl(mainUrl);

        Elements links = document.select("a[href]");
        ArrayList<String> urls = new ArrayList<>();
        for (Element link : links) {
            urls.add(link.attr("abs:href"));
        }

        Set<String> carsUrls = new HashSet<>();
        for (String url : urls) {
            if (url.contains("moskva/avtomobili/mercedes-benz_gle-klass")) {
                carsUrls.add(url);
            }
        }

        for (String url : carsUrls) {
            Document doc = client.getDataByUrl(url);

            Elements priceElement = doc.getElementsByClass("item-view-content").get(0).
                    getElementsByClass("gallery-img-wrapper js-gallery-img-wrapper");

            String title = priceElement.get(0).getAllElements().get(1).attributes().get("data-title");
            int pricePosition = priceElement.get(0).getAllElements().get(1).attributes().get("data-title").indexOf(PRICE_RU)+ PRICE_RU.length();

            StringBuilder carPrice = new StringBuilder(title);
            carPrice.delete(0, pricePosition + 1);

            // 0 - год выпуска
            // 1 - поколение
            // 2 - пробег
            // 3 - кол-во владельцев
            // 4 - битый/не битый
            // 5 - модификация
            // 6 - объем двигателя
            // 7 - тип двигателя (бензин/дизель)
            // 8 - коробка
            // 9 - привод
            // 10 - тип кузова
            // 11 - цвет
            // 12 - руль
            // 13 - часть ВИНа

            UsedCar car = new UsedCar();
            String[] carName = title.substring(0, title.indexOf(',')).split(" ");

            car.setManufacturer(carName[0]);
            car.setModel(carName[1]);
            car.setPrice(Integer.parseInt(carPrice.delete(carPrice.indexOf(" "), carPrice.length()).toString()));

            Elements carParametersElement = doc.getElementsByClass("item-view-content").get(0).getElementsByClass("item-params");
            car.setYear(Integer.parseInt(carParametersElement.get(0).child(0).child(0).childNodes().get(2).toString().trim()));
            StringBuilder mileage = new StringBuilder(carParametersElement.get(0).child(0).child(2).childNodes().get(2).toString());
            car.setMileage(Double.parseDouble(mileage.delete(mileage.indexOf("&"), mileage.length()).toString()));
            car.setEngineType(carParametersElement.get(0).child(0).child(7).childNodes().get(2).toString());
            car.setModification(carParametersElement.get(0).child(0).child(5).childNodes().get(2).toString());

            cars.add(car);
        }
    }

    public void printCars(){
        int count = 1;
        for (UsedCar car : cars) {
            System.out.println("Car #" + count + ": " + car.toString());
            count++;
        }
    }
}
