package AntiPattern;

public class Jornal extends Noticia {
    public void notificar(MeiosDeComunicacao meiosDeComunicacao){
        meiosDeComunicacao.update();
    };
    public void enviarNoticia(){
        for(MeiosDeComunicacao mc : meiosDeComunicacaoList){
            notificar(mc);
        }
    };
}
