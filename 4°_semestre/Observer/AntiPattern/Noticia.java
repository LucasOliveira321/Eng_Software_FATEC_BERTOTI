package AntiPattern;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
    public List<MeiosDeComunicacao> meiosDeComunicacaoList = new ArrayList<>();

    public void seguir(MeiosDeComunicacao meiosDeComunicacao){
        this.meiosDeComunicacaoList.add(meiosDeComunicacao);
    };
    public void pararDeSeguir(MeiosDeComunicacao meiosDeComunicacao){
        this.meiosDeComunicacaoList.remove(meiosDeComunicacao);
    };
}
