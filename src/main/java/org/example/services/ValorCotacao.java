package org.example.services;

import java.io.IOException;
import java.util.Scanner;

public class ValorCotacao {

    Scanner leitura = new Scanner(System.in);
    String busca = "";
    String valorUnitaro = "";
    String valorDesejado = "";
    ConverteMoeda converteMoeda = new ConverteMoeda();

    public String cotaValor() throws IOException, InterruptedException {
        valorUnitaro = converteMoeda.executaConvercao("USD", "ARS");
        System.out.println("Digite o valor que deseja converter: \n");
        valorDesejado = leitura.nextLine();

        Double resultado = Double.valueOf(valorUnitaro) * Double.valueOf(valorDesejado);

        System.out.println("\nO valor " + Double.valueOf(valorDesejado) + " [USD] " + "Correspode ao valor final de ==> " + resultado + "[ARS]");
        System.out.println("\nDigite (7) para terminar ou (C) para continuar\n");
        busca = leitura.nextLine();
        return "teste";
    }
}
