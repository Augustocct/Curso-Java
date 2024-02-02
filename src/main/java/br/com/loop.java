package br.com;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a avaliçao de 0 a 10 para o filme ");
            nota = leitura.nextDouble();
            //+= é mediaAvalicao mais ele mesmo
            mediaAvaliacao += nota;   
        }

        System.out.println("Media de avaliação " + mediaAvaliacao/3);
    }
}
