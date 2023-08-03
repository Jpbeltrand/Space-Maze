import javax.swing.JOptionPane;

public class Jupiter extends ElementoBasico {
    private boolean fechada;
    private boolean leuPista;
    private String mensagem;
    private String dica;
    private String senha;



    public boolean isLeuPista() {
        return leuPista;
    }

    public Jupiter(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro, String senha, String mensagem, String dica) {
        super(id, "jupiter.jpg", linInicial, colInicial, tabuleiro);
        this.fechada = true;
        this.leuPista = false;
        this.mensagem = mensagem;
        this.dica = dica;
        this.senha = senha;
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
        String senhaDigitada = JOptionPane.showInputDialog(getRootPane(), "Digite a senha:");

        if (senhaDigitada != null && senhaDigitada.toLowerCase().equals(senha.toLowerCase())) {
            leuPista = true;
            setImage(Tabuleiro.createImageIcon("jupiter.jpg"));
            JOptionPane.showMessageDialog(getRootPane(), "Charada");
            JOptionPane.showMessageDialog(getRootPane(), mensagem);
            JOptionPane.showMessageDialog(getRootPane(), "Dica");
            JOptionPane.showMessageDialog(getRootPane(), dica);
        } else {
            JOptionPane.showMessageDialog(getRootPane(), "Código inválido! Não desista, tente novamente!");
            fechada = true;
            setImage(Tabuleiro.createImageIcon("jupiter.jpg"));
        }
    } else {
        fechada = true;
        leuPista = true;
        setImage(Tabuleiro.createImageIcon("EspacoEstrelado.jpg"));
    }
}

}

