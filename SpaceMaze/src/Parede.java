

public class Parede extends ElementoBasico {
  private boolean paredeFalsa;
   private boolean fechada;

  public Parede(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
    super(id, "EspacoEstrelado.jpg", linInicial, colInicial, tabuleiro);
    this.paredeFalsa = false;
  }

  public void setParedeFalsa(boolean paredeFalsa) {
    this.paredeFalsa = paredeFalsa;
    if (paredeFalsa) {
      setImage(Tabuleiro.createImageIcon("EspacoEstrelado.jpg"));
    } else {
      setImage(Tabuleiro.createImageIcon("EspacoEstrelado.jpg"));
    }
  }

  public boolean isParedeFalsa() {
    return paredeFalsa;
  }

  @Override
  public void acao(ElementoBasico outro) {
        if (fechada) {
            
            setImage(Tabuleiro.createImageIcon("Pedra.jpg"));

        } else {
            setImage(Tabuleiro.createImageIcon("Pedra.jpg"));
        }
    }
}