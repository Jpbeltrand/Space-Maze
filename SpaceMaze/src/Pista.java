import javax.swing.JOptionPane;

public class Pista extends ElementoBasico {
    private boolean fechada;
    private boolean leuPista;
    private String mensagem;
    private String dica;


    public boolean isLeuPista() {
        return leuPista;
    }

    public Pista(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro, String mensagem, String dica) {
        super(id, "EspacoEstrelado.jpg", linInicial, colInicial, tabuleiro);
        this.fechada = true;
        this.leuPista = false;
        this.mensagem = mensagem;
        this.dica = dica;
    }

    public void verifica(){
        if (leuPista){
            System.out.println("teste");
        }
    }

    @Override
    public void acao(ElementoBasico outro) {
        if (fechada) {
            fechada = false;
            leuPista = true;
            setImage(Tabuleiro.createImageIcon("planeta.jpg"));
            JOptionPane.showMessageDialog(getRootPane(), "Charada");
            JOptionPane.showMessageDialog(getRootPane(), mensagem);
            JOptionPane.showMessageDialog(getRootPane(), "Dica");
            JOptionPane.showMessageDialog(getRootPane(), dica);

        } else {
            fechada = true;
            leuPista = true;
            setImage(Tabuleiro.createImageIcon("planeta.jpg"));
        }
    }
}
