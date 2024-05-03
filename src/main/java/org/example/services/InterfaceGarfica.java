package org.example.services;

public class InterfaceGarfica {
    public String Linha(Integer valor){
        StringBuilder linhaTamanho = new StringBuilder();
        for (int i = 0; i < valor; i++){
            linhaTamanho.append("*");
        }
        return linhaTamanho.toString();
    }

    public String menu(){
         String interfac = """
           ${Linha(50)}
""";
                return interfac;
    }
}
