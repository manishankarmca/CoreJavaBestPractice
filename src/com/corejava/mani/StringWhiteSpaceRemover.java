package com.corejava.mani;

/**
 * @author mani
 *
 */
public class StringWhiteSpaceRemover {

	
	    public static void main(String[] args)
	    {
	        String str = " If you want's  to   learn Java, earn turn and finally run Java  ";
	        System.out.println("Original String : "+str);
	        //1. Using replaceAll() Method
	 
	        String removeSpace = str.replaceAll("\\s", "");
	 
	        System.out.println("Step 1 to remove WhiteSpaces: "+removeSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
	 
	        //2. Without Using replaceAll() Method
	 
	        char[] strArray = str.toCharArray();
	 
	        StringBuffer sb = new StringBuffer();
	 
	        for (int i = 0; i < strArray.length; i++)
	        {
	            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
	            {
	                sb.append(strArray[i]);
	            }
	        }
	 
	        System.out.println("Step 2 to remove WhiteSpaces: "+sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
	    }
	}

