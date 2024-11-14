package exercicios;
import java.util.Scanner;

public class arvore_de_natal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o tamanho da arvore: ");
		int tamanho = entrada.nextInt();
		int i;
		int j;
		int z=0;
		for(i = 1;i<=tamanho;i++) {
			for (j = 0; j<tamanho-i;j++) {
				System.out.print(" ");
			}
			for (z=0;z<2*i-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(" ".repeat((z/2)-1)+"*".repeat(2));
		System.out.println(" ".repeat((z/2)-1)+"*".repeat(2));
		System.out.println(" ".repeat((z/2)-2)+"*".repeat(4));
	}
}