package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogado2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogado2};

        jogador.setTime(time);
        jogado2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----Jogador-----");
        jogador.imprime();
        jogado2.imprime();

        System.out.println("-----Time-----");
        time.imprime();
    }
}
