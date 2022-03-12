package br.com.cod3r.calc.visao;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador { // JPanel é um componente que agrupa outros componentes

    private final JLabel label;

    public Display(){

        Memoria.getInstancia().adicionarObervador(this); // aqui estamos registrando o interesse de quando um valor for alterado na memoria, tambem repassar a alteracao para o display e depois iremos exibi-lo

        setBackground(new Color(46,49,50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual()); // label é o display da calculadora
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); // Flowlayout é um gerenciador de layout

        add(label);

    }

    @Override
    public void valorAlterado(String novoValor) { // sempre que tivar uma mudanca na memoria, o display sera alterado
        label.setText(novoValor);
    }
}
