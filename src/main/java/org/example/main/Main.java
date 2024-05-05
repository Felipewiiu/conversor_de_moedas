package org.example.main;

import com.google.gson.Gson;
import org.example.model.ModeloConvertido;
import org.example.services.ConsumoApi;
import org.example.services.ConverteMoeda;
import org.example.services.InterfaceGarfica;

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



        while(!busca.equalsIgnoreCase("7")) {
            System.out.println(menu);
            System.out.println("\n[ DIGITE A OPÇÃO QUE DESEJA CONVERTER: ] \n");
            busca = leitura.nextLine();


//            System.out.println(converteMoeda.executaConvercao("USD", "AOA"));
            switch(busca) {
                case "1":
                    valorUnitaro = converteMoeda.executaConvercao("USD", "ARS");
                    System.out.println("Digite o valor que deseja converter: \n");
                    valorDesejado = leitura.nextLine();

                    Double resultado = Double.valueOf(valorUnitaro) * Double.valueOf(valorDesejado);

                    System.out.println("\nO valor " + Double.valueOf(valorDesejado) + " [USD] " + "Correspode ao valor final de ==> " + resultado + "[ARS]");
                    System.out.println("\nDigite (7) para terminar ou (C) para continuar\n");
                    busca = leitura.nextLine();

                    break;
                case "2":
                    System.out.println("valor corretp");
                    break;
                default:
            }

        }






    }
}