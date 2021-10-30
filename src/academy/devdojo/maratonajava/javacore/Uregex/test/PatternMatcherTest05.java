package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo q não for digito
        // \s = todos os espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo que não for no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // | ou
        // $ fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@gmail.com, 123jotaro@gmail.com, #@!zoro@mail.com, test@gmail.com.br, sakura@mail";
        System.out.println("Email valido: ");
        System.out.println("#@!zoro@mail.com".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texo: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        int numeroHex = 0x0F4;
        System.out.println(numeroHex);
    }
}
