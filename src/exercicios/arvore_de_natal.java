package exercicios;

public class arvore_de_natal {
	public static void main(String[] args) {
		int tamanho = 5;
		for(int i = 1;i<=tamanho;i++) {
			for (int j = 0; j<tamanho-i;j++) {
				System.out.print(" ");
			}
			for (int z=0;z<2*i-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(" ".repeat((tamanho/2)+1)+"*".repeat(2));
		System.out.println(" ".repeat((tamanho/2)+1)+"*".repeat(2));
		System.out.println(" ".repeat(tamanho/2)+"*".repeat(4));
	}
}