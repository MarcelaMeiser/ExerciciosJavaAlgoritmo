package curso_programacao;
import java.util.Scanner;
public class exercicio004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, y = 0;
		while (x != y) {
			System.out.println("Digite dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
			if (x < y) {
				System.out.println("CRESCENTE!");
			}
			if (y < x) {
				System.out.println("DECRESCENTE!");
			}
		}
		sc.close();
	}
}