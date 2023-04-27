public class Palindrome 
{
	static int isPalindrome(String k)
	{
		int length=k.length();
		for(int i=0; i<length; i++)
		{
			if (k.charAt(i) != k.charAt(length-1-i))
				return 0;
		}
		return 1;
	}

	public static void main(String[] args)
	{
		String text="3553";
	
		int len=text.length();
		String[] array= new String[(len*(len+1))/2];
		
		
		int index=0;
		for(int i=0; i<=len; i++)
		{
			for(int j=i+1; j<=len; j++)
			{
				array[index]=text.substring(i,j);
				index+=1;
			}
		}
			
		String ans=array[0];
	
		for(int i=0; i<index; i++)
		{
			if (  (isPalindrome(array[i])==1)  &&  (array[i].length() > ans.length())  )
				ans=array[i];
		}
		
		System.out.println("Longest substring palindrome is "+ans);
	}
}
