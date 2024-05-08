package org.example.main;

import com.google.gson.Gson;
import org.example.model.ModeloConvertido;
import org.example.services.ConsumoApi;
import org.example.services.ConverteMoeda;
import org.example.services.InterfaceGarfica;
import org.example.services.ValorCotacao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        String valorUnitaro = "";
        String valorDesejado = "";
        InterfaceGarfica interfaceGarfica = new InterfaceGarfica();
        String menu = interfaceGarfica.menu();
        ConverteMoeda converteMoeda = new ConverteMoeda();
        ValorCotacao valorCotacao = new ValorCotacao();



        while(!busca.equalsIgnoreCase("7")) {
            System.out.println(menu);
            System.out.println("\n[ DIGITE A OPÇÃO QUE DESEJA CONVERTER: ] \n");
            busca = leitura.nextLine();


//            System.out.println(converteMoeda.executaConvercao("USD", "AOA"));
            switch(busca) {
                case "1":
                    valorCotacao.cotaValor("USD", "ARS");
                    break;
                case "2":
                    valorCotacao.cotaValor("ARS", "USD");
                    break;
                case "3":
                    valorCotacao.cotaValor("USD", "BRL");
                    break;
                case "4":
                    valorCotacao.cotaValor("BRL", "USD");
                    break;
                case "5":
                    valorCotacao.cotaValor("USD", "COP");
                    break;
                case "6":
                    valorCotacao.cotaValor("COP", "USD");
                    break;
                default:
            }

        }






    }
}