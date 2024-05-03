package org.example.main;

import org.example.services.ConsumoApi;
import org.example.services.InterfaceGarfica;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsumoApi consumoApi = new ConsumoApi();
        InterfaceGarfica interfaceGarfica = new InterfaceGarfica();
        String menu = interfaceGarfica.menu();

        String resultado = consumoApi.BuscaDados("https://v6.exchangerate-api.com/v6/6c4a71f9adc8560015a27e23/latest/USD");

        System.out.println(resultado);
        System.out.println(menu);

    }
}