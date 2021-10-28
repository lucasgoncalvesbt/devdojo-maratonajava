package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Abacaxi ou banana ?");

        String text = input.next();

        if (text.equals("abacaxi")) {
            System.out.println("Acertou");
        } else if (text.equals("banana")) {
            System.out.println("Errou");
        }
    }
}
