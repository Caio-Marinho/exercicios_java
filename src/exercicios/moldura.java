package exercicios;

public class moldura {
	public static void main(String[] args) {
		for (int i =0;i<=5;i++) {
			System.out.print("=");
		}
		System.out.println();
		for (int j=0;j<=3;j++) {
			System.out.println("||"+" ".repeat(5-2)+"||");
		}
		for (int i =0;i<=5;i++) {
			System.out.print("=");
		}
	}
}
