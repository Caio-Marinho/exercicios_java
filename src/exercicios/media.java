package exercicios;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a 1º Nota: ");
		int nota1 = entrada.nextInt();
		System.out.print("Informe a 2º Nota: ");
		int nota2 = entrada.nextInt();
		System.out.print("Informe a 3º Nota: ");
		int nota3 = entrada.nextInt();
		int soma = nota1 + nota2 + nota3;
		float media =soma / 3;
		System.out.printf("A media do aluno foi : %.2f ",media);
		entrada.close();
	}

}
