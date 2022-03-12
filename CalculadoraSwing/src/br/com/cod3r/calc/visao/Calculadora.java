package br.com.cod3r.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();

        setSize(252,342);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // DISPOSE ON CLOSE finaliza a tela, O EXIT ON CLOSE TAMBEM
        setLocationRelativeTo(null); // centralizando a janela quando abrir
        setVisible(true);
    }

    private void organizarLayout() {
        // Border layout divide a tela entre norte, sul, leste, oeste e centro
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(253,80)); // tamanho do display
        // metodo add recebido por herança ja que estamos dentro de um JFrame
        add(display, BorderLayout.NORTH);// estamos posicionando o componente display no norte, baseado no layout que estamos usando, borderLayout

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
