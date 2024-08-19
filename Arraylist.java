package array;

import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[]args)
	{
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Daniel");
		nomes.add("Mateus");
		nomes.add(0, "João");
		String nomeDaPosicaoZero = nomes.get(0);
		String nomeDaPosicaoUm = nomes.get(1);
		System.out.println(nomeDaPosicaoZero);
		System.out.println(nomeDaPosicaoUm);
		int tamanhoDoArrayList = nomes.size();
		nomes.remove("Daniel");
		System.out.println(tamanhoDoArrayList);
		System.out.println(nomes);
	}
}