package exercicio01;

import java.util.Scanner;

public class Questao1 
{
	public static void main(String[]args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a altura do cilindro: ");
		int altura = leitor.nextInt();
		System.out.println("Digite o raio do cilindro: ");
		int raio = leitor.nextInt();
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		double volume = area * altura;
		System.out.println("O perímetro da circunferência da base do cilindro é: " + perimetro);
		System.out.println("A área da base da circunferência do cilindro é: " + area);
		System.out.println("O volume do cilindro é: " + volume);
	}
}