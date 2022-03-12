package swing;

import javax.swing.*;
import java.awt.*;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // estamos definindo o comportamento quando a janela é fechada
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // centralizando na tela

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

//      UTILIZANDO LAMBDA
        botao.addActionListener(e ->{
            System.out.println("Evento ocorreu!");
        });

//        UTILIZANDO CLASSE ANONIMA
//        botao.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {// classe anonima criada automaticamente
//                System.out.println("Evento ocorreu!");
//            }
//        });

        janela.setVisible(true);

    }
}
