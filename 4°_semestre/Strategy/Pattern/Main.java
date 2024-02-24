package Pattern;

import AntiPattern.Alimentacao;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Gato");
        gato.setAlimentacao(Alimentacao.CARNIVORO);
        gato.setTipo(Tipo.PREDADOR);

        Cavalo cavalo = new Cavalo("Cavalo");
        cavalo.setAlimentacao(Alimentacao.HERBIVORO);
        cavalo.setTipo(Tipo.PRESA);

        System.out.println(gato);
        System.out.println(cavalo);
    }
}
