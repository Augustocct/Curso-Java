package br.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Mavaerick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Media calculada pelas 3 notas 
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com gala dos anos 80
                8.5
                Ano de lançamento
                """+ anoDeLancamento;
        System.out.println(sinopse);
                    
        int classificacao = (int) (media /2);
        System.out.println(classificacao);
        
    }
}