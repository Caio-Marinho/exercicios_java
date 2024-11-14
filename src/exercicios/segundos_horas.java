package exercicios;
import java.util.Scanner;

public class segundos_horas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe os segundos: ");
		int segundos = entrada.nextInt();
		int minutos = segundos/60;
		int horas = segundos/3600;
		System.out.printf("O número de segundos equivale há %d horas e equivale há %d minutos\n",horas,minutos);
		int resto = segundos % 3600;
		minutos = resto/60;
		segundos = resto%60;
		System.out.printf("%d:%d:%d",horas,minutos,segundos);
		entrada.close();
	}
}