package exercicio01;

import java.util.Scanner;

public class Questao3 
{
	public static void main(String[]args)
	{
		int contadorNegativos = 0;
		int contadorPositivos = 0;
		int soma = 0;
		double mediaNegativos = 0;
		double mediaPositivos = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero1 = leitor.nextInt();
		if(numero1 < 0)
		{
			contadorNegativos++;
			mediaNegativos = numero1 + mediaNegativos;
			soma = numero1 + soma;
		}
		else if(numero1 > 0)
		{
			contadorPositivos++;
			mediaPositivos = numero1 + mediaPositivos;
			soma = numero1 + soma;
		}
		System.out.println("Digite o segundo número: ");
		int numero2 = leitor.nextInt();
		if(numero2 < 0)
		{
			contadorNegativos++;
			mediaNegativos = numero2 + mediaNegativos;
			soma = numero2 + soma;
		}
		else if(numero2 > 0)
		{
			contadorPositivos++;
			mediaPositivos = numero2 + mediaPositivos;
			soma = numero2 + soma;
		}
		System.out.println("Digite o terceiro número: ");
		int numero3 = leitor.nextInt();
		if(numero3 < 0)
		{
			contadorNegativos++;
			mediaNegativos = numero3 + mediaNegativos;
			soma = numero3 + soma;
		}
		else if(numero3 > 0)
		{
			contadorPositivos++;
			mediaPositivos = numero3 + mediaPositivos;
			soma = numero3 + soma;
		}
		System.out.println("Digite o quarto número: ");
		int numero4 = leitor.nextInt();
		if(numero4 < 0)
		{
			contadorNegativos++;
			mediaNegativos = numero4 + mediaNegativos;
			soma = numero4 + soma;
		}
		else if(numero4 > 0)
		{
			contadorPositivos++;
			mediaPositivos = numero4 + mediaPositivos;
			soma = numero4 + soma;
		}
		mediaNegativos = mediaNegativos / contadorNegativos;
		mediaPositivos = mediaPositivos / contadorPositivos;
		System.out.println("A média dos números positivos é: " + mediaPositivos);
		System.out.println("A média dos números negativos é: " + mediaNegativos);
		System.out.println("A soma de todos os valores é: " + soma);
	}
}