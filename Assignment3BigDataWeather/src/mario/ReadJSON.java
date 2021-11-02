package mario;

import java.io.*;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


//Need to adapt this code to target the weather API for ten countries



public class ReadJSON {

    static String cityName = "seattle";
    static String apiKey = "fb7d7af4019ac94fbf5e8338f9f77814";

    private  static String cityData = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&" + "appid=" + apiKey;

    public static void main (String[] args) throws Exception {

        //define JSON object and read the JSON file.
        StringBuilder builder = new StringBuilder();

        try {
            URL url = new URL (cityData);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String str = "";

            while (null != (str = br.readLine())) {
                builder.append(str + "\n");
            }

            System.out.println(str);

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(builder.toString());
            JSONObject jsonObject = ((JSONObject) obj);
            JSONObject city_weather_data = (JSONObject) jsonObject.get("weather");

            System.out.println(city_weather_data);
            System.out.println();

//            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
//            Number mxnRate = (Number) conversion_rates.get("MXN");
//
//            System.out.println(mxnRate);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
