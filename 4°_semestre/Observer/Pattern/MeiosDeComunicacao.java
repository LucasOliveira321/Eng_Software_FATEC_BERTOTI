package Pattern;

public class MeiosDeComunicacao implements Observer{
    private String nome;

    public MeiosDeComunicacao(String nome){
        this.nome = nome;
    }

    @Override
    public void update() {
        System.out.println(this.nome + " foi atualizado!");
    }
}
