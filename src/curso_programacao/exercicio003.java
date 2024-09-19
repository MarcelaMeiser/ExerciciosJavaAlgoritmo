package curso_programacao;
import java.util.Scanner;
public class exercicio003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, aux;
		System.out.print("Digite o 1º número: ");
		a = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		b = sc.nextInt();
		System.out.print("Digite o 3º número: ");
		c = sc.nextInt();
		if (a < b && a < c) {
			aux = a;
		}
		else if (b < c) {
			aux = b;
		}
		else {
			aux = c;
		}
		System.out.println(aux + " é o menor número");
		sc.close();
	}
}