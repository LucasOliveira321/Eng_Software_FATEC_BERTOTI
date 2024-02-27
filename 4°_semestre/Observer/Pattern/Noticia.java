package Pattern;

public interface Noticia {
    public void seguir(Observer observer);
    public void pararDeSeguir(Observer observer);
    public void notificar(Observer observer);
    public void enviarNoticia();
}
