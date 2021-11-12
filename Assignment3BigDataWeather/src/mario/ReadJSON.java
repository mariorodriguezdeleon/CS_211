package mario;

import java.io.*;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


//Need to adapt this code to target the weather API for ten countries

public class ReadJSON {

    static String cityName = "seattle";
    static String apiKey = "fb7d7af4019ac94fbf5e8338f9f77814";

    private  static String baseURL = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&units=imperial&" + "appid=" + apiKey;

    public static void main (String[] args) throws Exception {

        System.out.println("Expected URL: " + baseURL); //check to see that the url is being created as expected

        //define JSON object and read the JSON file.
        StringBuilder builder = new StringBuilder();

        try {

            URL url = new URL (baseURL);

            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String str;

            while (null != (str = br.readLine())) {
                builder.append(str).append("\n");

            }

            System.out.println("This is the builder: " + builder);

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(builder.toString());
            System.out.println("This is the object: " + obj);
            JSONObject jsonObject = ((JSONObject) obj);
            JSONObject city_weather_data = (JSONObject) jsonObject.get("main");
//            JSONObject main = (JSONObject) city_weather_data.get("temp");

            System.out.println(city_weather_data);
            System.out.println();

            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            double number = (double) city_weather_data.get("temp");
//            double price = (double) number;
            System.out.println(number);
//
//            System.out.println(mxnRate);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
