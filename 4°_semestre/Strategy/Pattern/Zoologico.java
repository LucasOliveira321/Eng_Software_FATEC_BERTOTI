package Pattern;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nome;
    private List<InstintoAnimal> habitatDasPresas = new ArrayList<>();
    private List<InstintoAnimal> habitatDosPredadores = new ArrayList<>();

    public Zoologico(String nome){
        this.nome=nome;
    }

    public void colocarNoHabitat(InstintoAnimal animal){
        if(animal.getTipo().equals(Tipo.PRESA)){
            habitatDasPresas.add(animal);
        } else if (animal.getTipo().equals(Tipo.PREDADOR)) {
            habitatDosPredadores.add(animal);
        }
    }

    public void mostraAnimais(){
        String habitatPresas = "";
        String habitatPredador = "";
        for(InstintoAnimal inst : habitatDasPresas){
            habitatPresas += inst.getAnimal() + " / ";
        }
        for(InstintoAnimal inst : habitatDosPredadores){
            habitatPredador += inst.getAnimal() + " / ";
        }

        System.out.println(" PRESAS: { " + habitatPresas + " }, PREDADORES: { " + habitatPredador + " }");
    }
}
