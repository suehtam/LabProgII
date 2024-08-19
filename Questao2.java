package exercicio01;

public class Questao2 
{
	public static void main(String[]args)
	{
		int par = 5;
		int tacadas = 10;
		if(tacadas == par - 1)
		{
			System.out.println("O jogador fez um birdie!");
		}
		else if((tacadas == par - 2) && (tacadas !=0))
		{
			System.out.println("O jogador fez um eagle!");
		}
		else if((tacadas <= par -3) && (tacadas != par) && (tacadas != 0))
		{
			System.out.println("O jogador fez um double eagle!");
		}
		else if(tacadas == par)
		{
			System.out.println("O jogador fez um hole-in-one!");
		}
		else if(tacadas == par + 1)
		{
			System.out.println("O jogador fez um bogey!");
		}
		else if(tacadas >= par + 2)
		{
			System.out.println("O jogador fez um double bogey!");
		}
		else
		{
			System.out.println("O jogador nem tacou ainda!");
		}
	}
}