package Pattern;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Noticia{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void seguir(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void pararDeSeguir(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notificar(Observer observer){
        observer.update();
    }

    @Override
    public void enviarNoticia() {
        for(Observer ob : observerList){
            notificar(ob);
        }
    }
}
