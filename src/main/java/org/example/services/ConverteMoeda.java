package org.example.services;

import com.google.gson.Gson;
import org.example.model.ModeloConvertido;

import java.io.IOException;

public class ConverteMoeda {

    public String executaConvercao(String moeda_base, String moeda_alvo) throws IOException, InterruptedException {
        ConsumoApi consumoApi = new ConsumoApi();
        String json = consumoApi.BuscaDados("https://v6.exchangerate-api.com/v6/0c4b76e3ded45b5fa44e487d/pair/" + moeda_base + "/" + moeda_alvo);
        Gson moeda = new Gson();
        ModeloConvertido conversao = moeda.fromJson(json, ModeloConvertido.class);

        return conversao.valorConvertido();
    }
}
