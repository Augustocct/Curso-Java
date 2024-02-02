package br.com;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento do filme");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga a avaliçao de 0 a 10 para o filme ");
        double avalicao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avalicao);
    }
}
