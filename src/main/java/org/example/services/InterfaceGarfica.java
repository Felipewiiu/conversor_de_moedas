package org.example.services;

public class InterfaceGarfica {
    public String Linha(){
        String caracter = "*";
        String linha = caracter.repeat(50);
        return linha;
    }

    public String menu(){
        return Linha() +
                "\n\n Seja bem-vindo ao Conversor de Moedas\n" +
                "\n (1) Dólar =>> Peso argentino" +
                "\n (2) Peso argentito =>> Peso Dólar" +
                "\n (3) Dólar =>> Real brasileiro" +
                "\n (4) Real brasileiro =>> Dólar" +
                "\n (5) Dólar =>> Peso colombiano" +
                "\n (6) Peso colombiano =>> Dólar" +
                "\n (7) Sair\n" +
                " Escolha uma opção válida:\n\n" +

                "    M M=====\n" +
                "  /-          \\\n" +
                "E  0          /~~\n" +
                " \\           /\n" +
                "  ¨¨W¨¨¨¨¨W¨  \n" +
                Linha();
    }
}
