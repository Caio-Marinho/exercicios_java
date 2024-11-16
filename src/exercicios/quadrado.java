package exercicios;
import java.util.Scanner;

public class quadrado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a largura: ");
		int largura = entrada.nextInt();
		System.out.print("Informe a altura: ");
		int altura = entrada.nextInt();
		for (int i = 1;i<=largura;i++) {
			System.out.print('x');
		}
		System.out.println();
		for (int j=1;j<=altura;j++) {
			System.out.println('x'+" ".repeat(3)+'x');
		}
		for (int z=1;z<=largura;z++) {
			System.out.print('x');
		}
		System.out.println();
		System.out.println("Esse quadrilatero tem "+(largura*altura)+" m²");
		entrada.close();
	}
}
