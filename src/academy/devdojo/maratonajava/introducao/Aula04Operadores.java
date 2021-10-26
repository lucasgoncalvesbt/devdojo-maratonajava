package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        //+ - * /
        int number1 = 10;
        int number2 = 20;
        int soma = number1 + number2;
        int sub = number1 - number2;
        int div = number2 / number1;
        int mult = number1 * number2;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // > < <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        System.out.println("----------------------------------------------");

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQue30);
        System.out.println(isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPs5 = 5000F;
        boolean isPs5Compravel = valorTotalContaCorrente > valorPs5 || valorTotalContaPoupanca > valorPs5;
        System.out.println(isPs5Compravel);

        System.out.println("----------------------------------------------");

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 200;
        bonus *= 2;
        bonus /= 3  ;
        System.out.println(bonus);

        // ++ --
        int cont = 0;
        cont++;
        cont--;
        System.out.println(cont);
    }

}
