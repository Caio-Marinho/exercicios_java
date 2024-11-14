package exercicios;
import java.util.Scanner;

public class media_array {
	//Tirar média por meio de uso de Array
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] notas = new int[3];
		int soma = 0;
		int tamanho = notas.length;
		for (int i = 0;i<tamanho;i++) {
			System.out.printf("Informe a %dª nota: ",i+1);
			notas[i] = entrada.nextInt();
			soma+=notas[i];
		}
		float media = (float) soma/notas.length;
		System.out.printf("A média do Aluno foi: %.2f",media);
		entrada.close();
	}
}
