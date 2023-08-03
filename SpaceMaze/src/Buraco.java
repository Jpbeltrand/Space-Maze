public class Buraco extends ElementoBasico {

    public Buraco(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "buraco.png", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {
       
    }
}
