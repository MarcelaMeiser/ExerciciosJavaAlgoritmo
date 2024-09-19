package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class exercicio006 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = 0, i;
		double soma = 0, media = 0;
		System.out.print("Digite a quantidade de números que serão digitados: ");
		n = sc.nextInt();
		Double[] vet = new Double[n];
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}
		media = soma / n;
		System.out.print("VALORES: ");
		for (i = 0; i < n; i++)
		{
			System.out.print(vet[i] + "  ");
		}
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		System.out.println("MÉDIA = " + String.format("%.2f", media));
		sc.close();
	}
}