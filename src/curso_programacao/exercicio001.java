package curso_programacao;
import java.util.Scanner;
public class exercicio001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 0, altura = 0, area = 0, perimetro = 0, diagonal = 0;
		System.out.print("Digite a base do retângulo: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt((base * base) + (altura * altura));
		System.out.println("Área do retângulo: " + String.format("%.4f", area));
		System.out.println("Perímetro do retângulo: " + String.format("%.4f", perimetro));
		System.out.println("Diagonal do retângulo: " + String.format("%.4f", diagonal));	
		sc.close();
	}
}