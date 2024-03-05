package AntiPattern;

public class Main {
    public static void main(String[] args) {
        Jornal jornal = new Jornal();

        MeiosDeComunicacao tv = new MeiosDeComunicacao("Televisão");
        MeiosDeComunicacao radio = new MeiosDeComunicacao("Radio");
        MeiosDeComunicacao podcast = new MeiosDeComunicacao("Podcast");

        jornal.seguir(tv);
        jornal.seguir(radio);
        jornal.seguir(podcast);

        jornal.pararDeSeguir(radio);

        jornal.enviarNoticia();
    }
}
