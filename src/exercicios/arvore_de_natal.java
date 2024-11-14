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
			for (j = 0; j<tamanho-i;j++) { // completa com espaços em branco e a cada loop reduz o espaço
				System.out.print(" "); // adiciona os espaços
			}
			for (z=0;z<2*i-1;z++) { // completa com caractere sempre dobrando e reduzindo o espaço em branco
				System.out.print("*"); // adiciona o caractere
			}
			System.out.println(); // Ao fim do loop pula uma linha
		}
		System.out.println(" ".repeat((z/2)-1)+"*".repeat(2));
		System.out.println(" ".repeat((z/2)-1)+"*".repeat(2));
		System.out.println(" ".repeat((z/2)-2)+"*".repeat(4));
	}
}