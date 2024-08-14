package estruturaDeRepeticao;

public class While 
{
	public static void main(String [] args)
	{
		int i = -10;
		while(i <= 10)
		{
			if (i % 3 == 0)
			{
				System.out.println(i + " e divisivel por 3");
			}
			else
			{
				System.out.println(i + "nao e divisivel por 3");
			}
			i = i++;
		}
	}
}
