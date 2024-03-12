package Pattern;

public class Main {
    public static void main(String[] args) {

        Animal cavalo = new Animal("Cavalo");
        cavalo.setAlimentacao(Alimentacao.MATO);

        Animal coelho = new Animal("Coelho");
        coelho.setAlimentacao(Alimentacao.CENOURA);

        Animal gato = new Animal("Gato");
        gato.setAlimentacao(Alimentacao.CARNE);

        Zoologico zoo = new Zoologico("Zoo");
        zoo.alimentarAnimal(cavalo);
        zoo.alimentarAnimal(coelho);
        zoo.alimentarAnimal(gato);
    }
}
