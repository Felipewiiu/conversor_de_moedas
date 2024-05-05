package org.example.model;

import com.google.gson.annotations.SerializedName;

public record ModeloConvertido(
        @SerializedName("base_code")
        String moedaBase,
        @SerializedName("target_code")
        String moedaAlvo,
        @SerializedName("conversion_rate")
        String valorConvertido
) {
}
