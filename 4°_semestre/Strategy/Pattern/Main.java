package Pattern;

public class Main {
    public static void main(String[] args) {

        Animal cavalo = new Animal("Cavalo");
        cavalo.setTipo(Tipo.PRESA);

        Animal coelho = new Animal("Coelho");
        coelho.setTipo(Tipo.PRESA);

        Animal gato = new Animal("Gato");
        gato.setTipo(Tipo.PREDADOR);

        Zoologico zoo = new Zoologico("Zoo");
        zoo.colocarNoHabitat(cavalo);
        zoo.colocarNoHabitat(coelho);
        zoo.colocarNoHabitat(gato);

        zoo.mostraAnimais();

    }
}
