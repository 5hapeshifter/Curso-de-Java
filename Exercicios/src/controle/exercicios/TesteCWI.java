package controle.exercicios;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class TesteCWI {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Informe o valor da memória, sem pontuação e maior que um.");

		BigInteger numEscolhido = new BigInteger(entrada);
		BigInteger zero = new BigInteger("0");
//		BigInteger multi = new BigInteger("1024");

		BigInteger kb = new BigInteger("1024");
		BigInteger mb = new BigInteger("1024000"); // tirar dois zeros e fazer a divisão que fica com duas casas
													// decimais!
		BigInteger gb = new BigInteger("1024000000");
		BigInteger tb = new BigInteger("1024000000000");
		BigInteger pb = new BigInteger("1024000000000000");
		BigInteger eb = new BigInteger("1024000000000000000");
		BigInteger zb = new BigInteger("1024000000000000000000");
		BigInteger yb = new BigInteger("1024000000000000000000000");
		BigInteger bb = new BigInteger("1024000000000000000000000000");

		BigInteger kbb = new BigInteger("1024");
//		BigInteger mbb = new BigInteger("1048576"); // tirar dois zeros e fazer a divisão que fica com duas casas decimais!
		BigInteger gbb = new BigInteger("1024000");
		BigInteger tbb = new BigInteger("1024000000");
		BigInteger pbb = new BigInteger("1024000000000");
		BigInteger ebb = new BigInteger("1024000000000000");
		BigInteger zbb = new BigInteger("1024000000000000000");
		BigInteger ybb = new BigInteger("1024000000000000000000");

		if (numEscolhido.compareTo(zero) < 1) {
			System.out.println("Número inválido.");
		} else {
			if (numEscolhido.compareTo(kb) < 0) {

				System.out.println("O tamanho do arquivo equivale a: " + numEscolhido + " B");
			} else if (numEscolhido.compareTo(kb) > -1 && numEscolhido.compareTo(mb) < 0) {
				double numKb = numEscolhido.divide(kbb).doubleValue();
				System.out.printf("O tamanho do arquivo equivale a: %.2f KB", numKb);
			} else if (numEscolhido.compareTo(mb) > -1 && numEscolhido.compareTo(gb) < 0) {
				double numMb = (numEscolhido.divide(kbb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f MB", numMb);
			} else if (numEscolhido.compareTo(gb) > -1 && numEscolhido.compareTo(tb) < 0) {
				double numGb = (numEscolhido.divide(gbb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f GB", numGb);
			} else if (numEscolhido.compareTo(tb) > -1 && numEscolhido.compareTo(pb) < 1) {
				double numTb = (numEscolhido.divide(tbb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f TB", numTb);
			} else if (numEscolhido.compareTo(pb) > -1 && numEscolhido.compareTo(eb) < 1) {
				double numPb = (numEscolhido.divide(pbb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f PB", numPb);
			} else if (numEscolhido.compareTo(eb) > -1 && numEscolhido.compareTo(zb) < 1) {
				double numEb = (numEscolhido.divide(ebb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f EB", numEb);
			} else if (numEscolhido.compareTo(zb) > -1 && numEscolhido.compareTo(yb) < 1) {
				double numZb = (numEscolhido.divide(zbb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f ZB", numZb);
			} else if (numEscolhido.compareTo(yb) > -1 && numEscolhido.compareTo(bb) < 1) {
				double numYb = (numEscolhido.divide(ybb).doubleValue()) / 1000;
				System.out.printf("O tamanho do arquivo equivale a: %.2f YB", numYb);
			} else {
				System.out.printf("Número não comportado pelo sistema.");
			}
		}
	}
}
