package estruturaDeCondicoes;

import java.util.Scanner;

public class Exemplo02 
{
	public static void main(String [] args)
	{
		int numero = 10;
		boolean paremenorque100;
		boolean paremaiorouiguala100;
		boolean imparemenorque100;
		boolean imparemaiorouiguala100;
		if ((numero % 2 == 0) && (numero < 100))
		{
			paremenorque100 = true;
			System.out.println(numero + "é par e menor que 100");
		}
		else if((numero % 2 == 0) && (numero >= 100))
		{
			paremaiorouiguala100 = true;
			System.out.println(numero + "é par e maior ou igual a 100");
		}
		else if((numero % 2 == 1) && (numero < 100))
		{
			imparemenorque100 = true;
			System.out.println(numero + "é ímpar e menor que 100");
		}
		else if((numero % 2 == 1) && (numero >= 100))
		{
			imparemaiorouiguala100 = true;
			System.out.println(numero + "é impar e maior ou igual a 100");
		}
	}
}
