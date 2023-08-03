import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuInicio extends JFrame implements ActionListener{
  private JButton buttonStart;
  private JButton buttonRegras;

  public MenuInicio(){
    //
    JLabel labelTitulo = new JLabel("Labirinto Espacial");
        //adicionar uma imagem no centro abaixo do titulo


        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
         //alterar fonte e tamanho da letra
        labelTitulo.setFont(labelTitulo.getFont().deriveFont(40.0f));



        buttonStart = new JButton("Start Game");
        buttonStart.addActionListener(this);
        buttonRegras = new JButton("Regras");
        buttonRegras.addActionListener(this);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        painelBotoes.add(buttonStart);
        painelBotoes.add(buttonRegras);
        //alterar fonte e tamanho da letra sem ser negrito
        buttonStart.setFont(buttonStart.getFont().deriveFont(15.0f));
        buttonRegras.setFont(buttonRegras.getFont().deriveFont(15.0f));
        


        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painelPrincipal.add(labelTitulo, BorderLayout.CENTER);
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(painelPrincipal);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == buttonStart) {
      this.dispose();
      new App();
    }
    if(e.getSource() == buttonRegras){
      exibirRegras();
      
    }
  }
  private void exibirRegras() {
        // Lógica para exibir as regras do jogo
        JOptionPane.showMessageDialog(this, "OBJETIVO: VOLTAR PARA TERRA COM A NAVE;\r\n" + //
            "\r\n" + //
            "1.Jogador deve pegar as dicas e resolver os enigmas para descobrir a senha da nave;\r\n" + //
            "2.Para o Jogador descobrir a senha da nave ele dever\u00E1 descobrir a senha de 2 portas;\r\n" + //
            "3.As portas est\u00E3o setadas dentro do jogo, em cada porta tem uma dica para o jogador descobrir a senha tanto das portas como da nave;\r\n" + //
            "4.O jogador tem 3 chances para descobrir a senha de cada porta se n\u00E3o ele perde o jogo;\r\n" + //
            "5.Se o jogador descobrir a senha das portas e da nave ele ganha o jogo;\r\n" + //
            "6.Se o jogador encotrar uma bomba ele perder\u00E1 o jogo e dever\u00E1 renicia-lo;\r\n" + //
            "\r\n" + //
            "BOA SORTE!");
    }
}
