package array;

public class Array2d 
{
	public static void main(String[]args)
	{
		int [] [] array2d = new int [64] [64];
		int contador = 0;
		for(int i = 0; i < array2d.length; i++)
		{
			for (int j = 0; j < array2d.length; j++)
			{
				array2d[i][j] = i + j;
				System.out.println("Valor na posição [" + i + "][" + j + "] = ");
				contador = contador + 1;
			}
		}
		System.out.println("Contador = " + contador);
	}
}