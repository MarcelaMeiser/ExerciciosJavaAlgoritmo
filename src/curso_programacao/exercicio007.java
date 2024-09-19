package curso_programacao;
import java.util.Scanner;
public class exercicio007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, i, j, somaNegativos = 0;
		System.out.println("Digite a ordem da matriz: ");
		n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
			{
				System.out.print("Elemento [ " + i + " , " + j + " ]:");
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					somaNegativos = somaNegativos + 1;
				}
			}
		}
		System.out.print("DIAGONAL PRINCPAL: ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == j)
				{
					System.out.print(mat[i][j] + "  ");
				}
			}
		}
		System.out.println("\nQUANTIDADE DE NEGATIVOS: " + somaNegativos);
		sc.close();
	}
}