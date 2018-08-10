package com.stackroute.pe4TestCases;

public class Transpose {

	public String doTranspose(String s)
	{
		String[] str=s.split(" ");
		String res="";
		int len=str.length;
		String result="";
		for(int i=0;i<len;i++)
		{
			StringBuilder sb = new StringBuilder(str[i]);
			sb=sb.reverse();
			res=res+sb.toString();
		}
		return res;
		
	}

}
