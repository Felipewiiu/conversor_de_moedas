package org.example.services;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsumoApi {
    // Setting URL
    String url_str = "https://v6.exchangerate-api.com/v6/6c4a71f9adc8560015a27e23/latest/USD";

    // Making Request
    URL url = new URL(url_str);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

    // Convert to JSON
    JsonParser jp = new JsonParser();
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
    JsonObject jsonobj = root.getAsJsonObject();

    // Accessing object
    String req_result = jsonobj.get("result").getAsString();

    public ConsumoApi() throws IOException {
    }
}
