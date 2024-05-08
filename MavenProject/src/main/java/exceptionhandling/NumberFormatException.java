package exceptionhandling;

public class NumberFormatException {
	public void show()
	{
		try
		{
			String a="hello";
			int num=Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e)
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
