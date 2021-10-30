package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo q não for digito
        // \s = todos os espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo que não for no \w

        String regex = "\\w";
        String texto = "abaaba";
        String texto2 = "1@#j24lk2_41k15";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texo: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
