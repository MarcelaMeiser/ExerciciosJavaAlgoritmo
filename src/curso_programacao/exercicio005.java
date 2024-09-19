package curso_programacao;
import java.util.Scanner;
public class exercicio005 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, i, aux = 0, soma = 0;
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		if (x > y) {
			aux = x;
			x = y;
			y = aux;
		}
		for (i = x + 1; i < y; i++) {
			if (i % 2 == 1) {
				soma = soma + i;
			}
		}
		System.out.print("SOMA DOS ÍMPARES: " + soma);
		sc.close();
	}
}