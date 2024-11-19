package exercicios;

public class espaco {
	public static void main(String[] args) {
		String [] array = {"um","dois","três"};
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println(array[i]);
		}
	}
}