package Pattern;

public class Main {
    public static void main(String[] args) {
        MeiosDeComunicacao televisao = new MeiosDeComunicacao("televisão");
        MeiosDeComunicacao revista = new MeiosDeComunicacao("revista");
        MeiosDeComunicacao radio = new MeiosDeComunicacao("radio");

        Jornal jornal = new Jornal();
        jornal.seguir(televisao);
        jornal.seguir(revista);
        jornal.seguir(radio);

        jornal.pararDeSeguir(revista);

        jornal.enviarNoticia();
    }
}
