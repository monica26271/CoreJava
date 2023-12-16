package weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class Weather {

    private static final String API_KEY = "a440fa5f6d775eb2100c8410ee4f764d";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String city = "London"; 
        String apiUrl = buildApiUrl(city);

        try {
            String jsonResponse = getWeatherData(apiUrl);
            printWeatherDetails(jsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String buildApiUrl(String city) {
        return String.format("%s?q=%s&appid=%s", API_URL, city, API_KEY);
    }

    private static String getWeatherData(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            // Set up HTTP GET request
            connection.setRequestMethod("GET");

            // Get response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return response.toString();
            } else {
                throw new IOException("HTTP error code: " + responseCode);
            }
        } finally {
            connection.disconnect();
        }
    }

    private static void printWeatherDetails(String jsonResponse) {
        JSONObject json = new JSONObject(jsonResponse);

        // Extracting relevant information
        String cityName = json.getString("name");
        JSONObject main = json.getJSONObject("main");
        double temperature = main.getDouble("temp");
        double humidity = main.getDouble("humidity");
        
        

        // Print the information
        System.out.println("Weather Details for " + cityName + ":");
        System.out.println("Temperature: " + temperature + " Kelvin");
        System.out.println("Humidity: " + humidity + "%");
        
        
    }
}

