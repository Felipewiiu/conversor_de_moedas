package org.example.services;

import java.io.IOException;
import java.util.Scanner;

public class ValorCotacao {

    Scanner leitura = new Scanner(System.in);
    String busca = "";
    String valorUnitaro = "";
    String valorDesejado = "";
    ConverteMoeda converteMoeda = new ConverteMoeda();

    public void cotaValor(String moedaBase, String moedaAlvo ) throws IOException, InterruptedException {
        valorUnitaro = converteMoeda.executaConvercao(moedaBase, moedaAlvo);
        System.out.println("Digite o valor que deseja converter: \n");
        valorDesejado = leitura.nextLine();

        Double resultado = Double.valueOf(valorUnitaro) * Double.valueOf(valorDesejado);

        System.out.println("\nO valor " + Double.valueOf(valorDesejado) + " " + moedaBase + " Correspode ao valor final de ==> " + resultado + " " + moedaAlvo);
        System.out.println("\nDigite (7) para terminar ou (C) para continuar\n");
        busca = leitura.nextLine();

    }
}
