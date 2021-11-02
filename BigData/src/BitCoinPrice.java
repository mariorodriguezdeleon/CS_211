import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class BitCoinPrice {

    private  static String coinURL = "https://api.coindesk.com/v1/bpi/currentprice.json";

    public static void main (String[] args) throws Exception {

        //define JSON object and read the JSON file.
        StringBuilder builder = new StringBuilder();

        try {
            URL url = new URL (coinURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String str = "";

            while (null != (str = br.readLine())) {
                builder.append(str + "\n");
            }

            System.out.println(builder);

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(builder.toString());
            JSONObject jsonObject = ((JSONObject) obj);
            System.out.println(obj);
            JSONObject bpi = (JSONObject) jsonObject.get("bpi");
            JSONObject usd = (JSONObject) bpi.get("USD");

            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number number = format.parse((String) usd.get("rate"));
            double price = number.doubleValue();
            System.out.println(price);

            String descr = (String) usd.get("description");
            System.out.println(descr);

        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
