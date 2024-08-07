package entrada_saida;

import java.util.Scanner;

public class Exemplo01 
{
	public static void Main(String [] args)
	{
		//comentarios simples - de uma unica linha
	
		//funcoes de entrada
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = scanner.next();
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		//funcao de saida
		System.out.println("Hello World");
		System.out.println("Seu nome eh :" + nome);
		System.out.println("Sua idade eh: " + idade);
		int diasVivo = idade * 365;
		System.out.println("Digite um numero");
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		double quadrado = Math.pow(numero, 2);
	}
}