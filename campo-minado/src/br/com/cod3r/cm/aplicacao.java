package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(12, 12, 12);
		new TabuleiroConsole(tabuleiro);
			
		System.out.println(tabuleiro);
		
	}
}
