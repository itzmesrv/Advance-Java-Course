package com.mycompany.app;

public class Cipher
{ 
    //public static String Encrypt(String k,int shift_amount)
    public static String Encrypt(String k)
    {
        int temp=0;
        int shift_amount = 5;
        //String k = "123.][sairam", ans="";
        String ans="";
        int length=k.length();
               
        if(shift_amount <= 25 && shift_amount >=-25)
        {
		    for(int i=0;i<length;i++)
		    {
		    	if(( (int)k.charAt(i) >=65 && (int)k.charAt(i) <= 90 ) || ((int)k.charAt(i) >=97 && (int)k.charAt(i) <= 122))	
		    	{
					temp = (int)k.charAt(i);
					temp = temp + shift_amount;
					ans = ans + (char)temp;
		    	}
		    	else
		    	{
		    		ans = ans + k.charAt(i);
		    	}
		    	
		    }      
		    System.out.println(ans); 
        }
        else
        	System.out.println("invalid range of shift_amount");
    return ans;
   	}
   	
}

