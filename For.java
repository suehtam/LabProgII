package estruturaDeRepeticao;

public class For 
{
	public static void main(String [] args)
	{
		for(int i = -10; i <= 10; i++)
		{
			if (i % 3 == 0)
			{
				System.out.println(i + " e divisivel por 3");
			}
			else
			{
				System.out.println(i + "nao e divisivel por 3");
			}
		}
	}
}
