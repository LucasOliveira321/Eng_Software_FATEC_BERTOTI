package Pattern;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa("Caixa", new BigDecimal(3));
        Chave chave = new Chave("Chave", new BigDecimal(23));
        Ferramenta ferramenta = new Ferramenta("Ferramenta", new BigDecimal(46.5));

        caixa.colocarDentroDaCaixa(chave);
        caixa.colocarDentroDaCaixa(ferramenta);

        System.out.println(caixa);
    }
}
