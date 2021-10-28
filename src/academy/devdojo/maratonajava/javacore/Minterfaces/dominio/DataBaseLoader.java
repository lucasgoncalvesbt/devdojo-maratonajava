package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do BD");
    }
}
