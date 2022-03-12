package controle.exercicios;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class TesteMetodoCWI2 {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Informe o valor da memória, sem pontuação e maior que um.");

		BigInteger numEscolhido = new BigInteger(entrada);
		BigInteger zero = new BigInteger("0");

		BigInteger kb = new BigInteger("1024");
		BigInteger mb = new BigInteger("1048576");
		BigInteger gb = new BigInteger("1073741824");
		BigInteger tb = new BigInteger("1099511627776");
		BigInteger pb = new BigInteger("1125899906842624");
		BigInteger eb = new BigInteger("1152921504606846976");
		BigInteger zb = new BigInteger("1180591620717411303424");
		BigInteger yb = new BigInteger("1208925819614629174706176");
		BigInteger bb = new BigInteger("1237940039285380274899124224");

		
				
		while (numEscolhido.compareTo(zero) < 1) {
			System.out.println("Número inválido. Digite um valor maior que Zero (0) ou Zero (0) para encerrar o programa.");
			
		} 	if (numEscolhido.compareTo(kb) < 0) {

				System.out.println("O tamanho do arquivo equivale a: " + numEscolhido + " B");
			} else if (numEscolhido.compareTo(kb) > -1 && numEscolhido.compareTo(mb) < 0) {
				double numKb = numEscolhido.doubleValue() / kb.doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f KB", numKb);
			} else if (numEscolhido.compareTo(mb) > -1 && numEscolhido.compareTo(gb) < 0) {
				double numMB = (numEscolhido.doubleValue() / mb.doubleValue());
				System.out.printf("O tamanho do arquivo equivale a: %.2f MB", numMB);
			} else if (numEscolhido.compareTo(gb) > -1 && numEscolhido.compareTo(tb) < 0) {
				double numGB = (numEscolhido.doubleValue() / gb.doubleValue());
				System.out.printf("O tamanho do arquivo equivale a: %.2f GB", numGB);
			} else if (numEscolhido.compareTo(tb) > -1 && numEscolhido.compareTo(pb) < 1) {
				double numTB = numEscolhido.doubleValue() / tb.doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f TB", numTB);
			} else if (numEscolhido.compareTo(pb) > -1 && numEscolhido.compareTo(eb) < 0) {
				Double numPB = numEscolhido.doubleValue() / pb.doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f PB", numPB);
			} else if (numEscolhido.compareTo(eb) > -1 && numEscolhido.compareTo(zb) < 0) {
				double numEB = (numEscolhido.divide(pb).doubleValue()) / kb.doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f EB", numEB);
			} else if (numEscolhido.compareTo(zb) > -1 && numEscolhido.compareTo(yb) < 0) {
				double numZB = (numEscolhido.divide(pb).doubleValue()) / mb.doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f ZB", numZB);
			} else if (numEscolhido.compareTo(yb) > -1 && numEscolhido.compareTo(bb) < 0) {
				double numYB = (numEscolhido.divide(pb).doubleValue()) / gb.doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f YB", numYB);
			} else {
				System.out.printf("Número não comportado pelo sistema.");
			}
		}

	}
