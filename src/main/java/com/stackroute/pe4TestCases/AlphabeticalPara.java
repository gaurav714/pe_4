package com.stackroute.pe4TestCases;

public class AlphabeticalPara {

	public String sortPara(String a)
	{
		
		String[] str=a.split(" ");
		 for (int i = 0; i < str.length-1; i++)
	        {
	            for (int j = i+1; j < str.length; j++)
	            {
	            	if (str[i].compareTo(str[j]) > 0) 
	            	{
	                    String temp=str[j]; 
	                    str[j]=str[i];
	                    str[i]=temp;
	            	}
	            }
	        }
		 String res="";
		 for(int k=0;k<str.length;k++)
		 {
			 res=res+str[k];
			 res=res+" ";
		 }
		 return res.trim();
		}
}
	


