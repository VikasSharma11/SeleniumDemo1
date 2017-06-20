package DemoPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stringss {

	public static void main(String[] args) {
//		String s = "(  1 - 3 of 23  )";
//		String[] ss = s.split("\\s+",2);
//		for (String w:s.split(s, 2))
//			
//		System.out.println(w);
//		
		
		
//		int index = s.length();
//		String subString = s.substring(12, 14);
//		String reverse = "";
//		System.out.println(subString);
//		System.out.println("Length is " + index);
//		System.out.println("Origninal Strig is" + s);
//		StringBuffer sb = new StringBuffer("Vikas");
//		sb.append("sharma");
//		System.out.println("New string is" + sb);
//
//		// -------- To reverse a string------
//
//		String sname = "nitin";
//		char[] cname = sname.toCharArray();
//		for (int i = cname.length - 1; i >= 0; i--) {
//			reverse = reverse + cname[i];
//		}
//		if (reverse.equals(sname))
//			System.out.println("It  is pallindrom");
//		System.out.println("Reverese String is" + reverse);

	
//--------- To split each word---------		
		
		
//		String name ="My name is sharma";
//		
//		String[] reverse=name.split("\b");
//		String[] reverseCorrect;
//		
//		System.out.println(reverse[2]);
////	    int reverseLenght=reverse.length;
//	    
//	    for(int i=reverseLenght-1;i>=0;i--)
//	    {
//	      reverseCorrect[] = reverseCorrect[].reverse[i].re	
//	    	    	
//	    }
//	    
		List<String> name=new LinkedList<>();
				
		name.add("Vikas1");
		name.add("Vikas2");
		name.add("Vikas3");
		
		for (String print: name)
		{
			System.out.println("Value of each name is"+ print);
			
		}
		
		List<String> name1 = new ArrayList<>();
		
		name1.add("1");
		name1.add("Vikas");
		
		for (String dislay:name1)
		{
			System.out.println("Name using array list"+dislay);
		}
		

		
		List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	
	for (int i:list)
	{
		System.out.println(i);
	}
	List<Character> cha =new  ArrayList<>();
	cha.add('a');
	cha.add('b');
	cha.add('c');
	
	for (char p:cha)
	{
		System.out.println(p);
	}
	
	
		
		
	}}
