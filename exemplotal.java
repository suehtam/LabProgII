package array;

import java.util.Scanner;

public class exemplotal 
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		int[] minhaLista = new int[tamanho];
		for(int i = 0; i < minhaLista.length; i++)
		{
			System.out.println("Digite o " + i + " elemento: ");
			minhaLista[i] = scanner.nextInt();
		}
		for(int i = 0; i < minhaLista.length; i++)
		{
			System.out.println("Array[" + i + "] = " + minhaLista[i]);
		}
	}
}