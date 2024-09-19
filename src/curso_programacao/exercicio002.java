package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class exercicio002 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		int idade1, idade2;
		double mediaIdade;
		System.out.println("Dados da 1ª pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		System.out.println("Dados da 2ª pessoa: ");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		mediaIdade = (double)(idade1 + idade2) / 2;
		System.out.println("A idade média de " + nome1 + " e " + nome2 + " é igual a " + String.format("%.1f", mediaIdade));
		sc.close();
	}

}