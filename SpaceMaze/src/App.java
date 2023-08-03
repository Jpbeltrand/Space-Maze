import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class App extends JFrame implements ActionListener {
    private Tabuleiro tabuleiro;
    private Personagem personagem;
    private static Bomba bomba;
    private static Bomba bomba2;
    private static Bomba bomba3;
    

    public App() {
        super();
        tabuleiro = new Tabuleiro();

        JPanel painelGeral = new JPanel();
        painelGeral.setLayout(new BoxLayout(painelGeral, BoxLayout.PAGE_AXIS));
        painelGeral.add(tabuleiro);
       
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        JButton botao = new JButton("Reiniciar");
        botao.addActionListener(this);
        painelBotoes.add(botao);
        painelGeral.add(painelBotoes);

        personagem = new Personagem("Feliz", "astronauta.jpg", 3, 0, tabuleiro);
        ElementoBasico anterior = tabuleiro.insereElemento(personagem);
        personagem.setAnterior(anterior);

        Jupiter pista1 = new Jupiter("Pista1", 1, 1, 3, tabuleiro, "jupiter", "Com ci\u00EAncia e explora\u00E7\u00E3o, sou associada,\r\n" +
                "No espa\u00E7o e al\u00E9m, minha fama \u00E9 consagrada.\r\n" +
                "Descubro segredos c\u00F3smicos, de forma audaciosa,\r\n" +
                "Trabalho com astronautas e sondas espaciais, sou a...?\r\n" +
                "\r\n" + "Quem sou eu?", "Cuidado ao andar para cima!\r\n");
       
                tabuleiro.insereElemento(pista1);

        Pista pista2 = new Pista("Pista2", 2, 3, 1, tabuleiro, "Sou o maior dos planetas, gigante e majestoso,\r\n" + //
                "Com tempestades furiosas, um verdadeiro alvoro\u00E7o.\r\n" + //
                "Tenho uma grande mancha, famosa e peculiar,\r\n" + //
                "Com mais de 60 luas, sou um espet\u00E1culo singular.\r\n" + //
                "\r\n" + //
                "Quem sou eu?", "Nao ande para cima e cuidado onde pisa!\r\n");
        
                tabuleiro.insereElemento(pista2);

        Nasa pista3 = new Nasa("Pista3", 3, 0, 5, tabuleiro, "nasa", "Sou um n\u00FAmero fundamental, de grande relev\u00E2ncia,\r\n" +
                "Represento o passo audaz na explora\u00E7\u00E3o da dist\u00E2ncia.\r\n" +
                "Tr\u00EAs vezes a Lua eu ultrapasso em altura,\r\n" +
                "Com uma esta\u00E7\u00E3o, constru\u00ED um novo patamar de aventura.\r\n" +
                "\r\n" + "Qual n\u00FAmero sou eu?", "Ao chegar perto da nave cuidado com os cantos!\r\n");
        
                tabuleiro.insereElemento(pista3);

        bomba = new Bomba("Bomba", 2, 0, tabuleiro);
        tabuleiro.insereElemento(bomba);

        bomba2 = new Bomba("Bomba", 0, 4, tabuleiro);
        tabuleiro.insereElemento(bomba2);

        bomba3 = new Bomba("Bomba", 6, 6, tabuleiro);
        tabuleiro.insereElemento(bomba3);

        Parede paredeFalsa = new Parede("ParedeFalsa", 4, 1, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa);
        Parede paredeFalsa2 = new Parede("ParedeFalsa2", 6, 0, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa2);
        Parede paredeFalsa3 = new Parede("ParedeFalsa3", 6, 1, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa3);
        Parede paredeFalsa4 = new Parede("ParedeFalsa4", 6, 2, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa4);
        Parede paredeFalsa5 = new Parede("ParedeFalsa5", 1, 0, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa5);
        Parede paredeFalsa6 = new Parede("ParedeFalsa6", 0, 0, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa6);
        Parede paredeFalsa7 = new Parede("ParedeFalsa8", 1, 2, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa7);
        Parede paredeFalsa8 = new Parede("ParedeFalsa8", 2, 5, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa8);
        Parede paredeFalsa9 = new Parede("ParedeFalsa9", 2, 4, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa9);
        Parede paredeFalsa10 = new Parede("ParedeFalsa10", 4, 4, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa10);
        Parede paredeFalsa11 = new Parede("ParedeFalsa11", 4, 5, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa11);
        Parede paredeFalsa12 = new Parede("ParedeFalsa12", 5, 4, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa12);
        Parede paredeFalsa13 = new Parede("ParedeFalsa13", 0, 6, tabuleiro);
        tabuleiro.insereElemento(paredeFalsa13);

        Saturno saturno = new Saturno("Saturno",  2, 3, tabuleiro);
        tabuleiro.insereElemento(saturno);
       
        Marte marte = new Marte("Marte",  0, 3, tabuleiro);
        tabuleiro.insereElemento(marte);
        
        Urano urano = new Urano("Urano",  4, 3, tabuleiro);
                tabuleiro.insereElemento(urano);
        
        Netuno netuno = new Netuno("Netuno",  5, 3, tabuleiro);
        tabuleiro.insereElemento(netuno);

        Nave nave = new Nave("nave", 6, 3, tabuleiro);
        tabuleiro.insereElemento(nave);

        this.add(painelGeral);
        this.setSize(1100, 1100);
        this.setTitle("Labirinto Espacial");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        tabuleiro.atualizaVisualizacao();

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        personagem.moveCima();
                        break;
                    case KeyEvent.VK_DOWN:
                        personagem.moveBaixo();
                        break;
                    case KeyEvent.VK_LEFT:
                        personagem.moveEsquerda();
                        break;
                    case KeyEvent.VK_RIGHT:
                        personagem.moveDireita();
                        break;
                }
                tabuleiro.atualizaVisualizacao();
            }
        });
         this.setFocusable(true);   
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() instanceof JButton) {
            JButton source = (JButton) arg0.getSource();
            if (source.getText().equals("Reiniciar")) {
                reiniciarApp();
            }
        }
    }
     
    

    public static void main(String[] args) {
        MenuInicio menu = new MenuInicio(); 
    }
    
    public void reiniciarApp() {
        System.out.println("Reiniciando o jogo...");
        dispose();
        App novoApp = new App();
        novoApp.setVisible(true);
    }

  
    
}


