package exercicios;

public class arvore_de_natal {
	public static void main(String[] args) {
		int base = 6;
		for(int i = 1;i<=base;i++) {
			for (int j = 0; j<base-i;j++) {
				System.out.print(" ");
			}
			for (int z=0;z<2*i-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(" ".repeat(base-2)+"*".repeat(2));
		System.out.println(" ".repeat(base-2)+"*".repeat(2));
		System.out.println(" ".repeat(base-3)+"*".repeat(4));
	}
}