package com.stackroute.pe4TestCases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {

	public String testOccurrence(String s)
	{
	String str="se",res="";
	Pattern pattern = Pattern.compile(s);
    Matcher matcher = pattern.matcher(str);
    while(matcher.find()) {
        res=res+("found at:"
                + matcher.start() + " - " + matcher.end()+" ");
    }
return res;
	
	}

}
