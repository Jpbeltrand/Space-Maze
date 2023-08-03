import javax.swing.JOptionPane;

public class Bomba extends ElementoBasico {
  private boolean bomba;

  public Bomba(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
    super(id, "EspacoEstrelado.jpg", linInicial, colInicial, tabuleiro);
    this.bomba = false;
  }

  public void setBomba() {
    this.bomba = true;
    setImage(Tabuleiro.createImageIcon("asteroid.jpg"));
  }

  public boolean isBomba() {
    return bomba;
  }

  @Override
  public void acao(ElementoBasico outro) {
    if (bomba) {
      bomba = false;
      setImage(Tabuleiro.createImageIcon("EspacoEstrelado.jpg"));
    } else {
      setBomba();
      JOptionPane.showMessageDialog(getRootPane(), "Você perdeu! Clique em Reniciar para jogar novamente!");
     
      
    }
  }
}





