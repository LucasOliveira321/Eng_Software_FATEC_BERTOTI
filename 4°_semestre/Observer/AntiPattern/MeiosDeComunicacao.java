package AntiPattern;

public class MeiosDeComunicacao {
    private String nome;

    public MeiosDeComunicacao(String nome){
        this.nome = nome;
    }
    public void update() {
        System.out.println(this.nome + " foi atualizado!");
    }
}
