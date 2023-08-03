

import javax.swing.JOptionPane;

public class Nave extends ElementoBasico {
    private static int tentativas = 0;
    

    public Nave(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "nave.jpg", linInicial, colInicial, tabuleiro);
        
    }

    

    @Override
    public void acao(ElementoBasico outro) {
        if (tentativas == 3) {
            JOptionPane.showMessageDialog(getRootPane(), "Muitas tentativas, você perdeu!");
            System.exit(0);
        }
        String codigo = JOptionPane.showInputDialog(getRootPane(), "Digite o código");
        if (codigo.equals("400")) {
            setImage(Tabuleiro.createImageIcon("navezi.gif"));
            getTabuleiro().atualizaVisualizacao();
            JOptionPane.showMessageDialog(getRootPane(), "Parabéns você embarcou na nave para voltar para casa!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(getRootPane(), "Código inválido! Não desista, tente novamente!");
        }
        tentativas++;
    }

    
}

   

    

