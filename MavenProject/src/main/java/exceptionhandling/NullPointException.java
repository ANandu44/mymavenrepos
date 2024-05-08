package exceptionhandling;

public class NullPointException {
	public void show()
	{
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			
		}
		System.out.println("exception handled");
		
	}

	public static void main(String[] args) {
		NullPointException obj=new NullPointException();
		obj.show();

	}

}
