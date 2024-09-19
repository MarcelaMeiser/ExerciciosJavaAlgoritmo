//PACOTE SELECIONADO:
package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

//BIBLIOTECAS IMPORTADAS:
//CLASSE CRIADA:
public class Main {
	//FUNÇÃO CRIADA:	
	public static void main(String[] args) {
		//MÉTODOS/CÓDIGO:
		//COMANDO DE UTILIZAÇÃO DO '.' EM NÚMEROS DECIMAIS:
		Locale.setDefault(Locale.US);
		
		//PROCESSAMENTO DE DADOS:
		//int idade;
		//double salario, altura;
		//char genero;
		//String nome;
		
		//idade = 30;
		//salario = 5800.5;
		//altura = 1.72;
		//genero = 'F';
		//nome = "Maria Silva";
		
		//SAÍDA DE DADOS:
		//System.out.println("IDADE = " + idade);
		//System.out.println("SALARIO = " + String.format("%.2f", salario));
		//System.out.println("ALTURA = " + String.format("%.2f", altura));
		//System.out.println("GENERO = " + genero);
		//System.out.println("NOME = " + nome);
		
		//PROCESSAMENTO DE DADOS:
		String nome1, nome2;
		double salario1, salario2;
		int idade;
		char genero;
		
		//ENTRADA DE DADOS:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da 1ª pessoa: ");
		nome1 = sc.nextLine();
		System.out.println("Digite o salário da 1ª pessoa: ");
		salario1 = sc.nextDouble();
		System.out.println("Digite o nome da 2ª pessoa: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.println("Digite o salário da 2ª pessoa: ");
		salario2 = sc.nextDouble();
		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();
		System.out.println("Digite um gênero: ");
		genero = sc.next().charAt(0);
		
		System.out.println("Nome 1ª pessoa: " + nome1);
		System.out.println("Salário 1ª pessoa: R$" + String.format("%.2f", salario1));
		System.out.println("Nome 2ª pessoa: " + nome2);
		System.out.println("Salário 2ª pessoa: R$" + String.format("%.2f", salario2));
		System.out.println("Idade: " + idade);		
		System.out.println("Gênero: " + genero);
		
		sc.close();
	}
}
