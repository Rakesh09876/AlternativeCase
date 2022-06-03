package com.test.AlternativeCase;
import java.util.*;
public class AlternativeCase {

	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter a string :");
		      String str = sc.nextLine();
		      AlternativeCase obj = new AlternativeCase();
		      obj.alternativeCase(str);
		   }
	 void alternativeCase(String s)
	 {
		  s = s.toLowerCase();
	      char[] ch = s.toCharArray();
	      for(int i=0; i<ch.length; i=i+2)
	      {
	       ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.print("Your String in Alternative case : ");
	      System.out.println(new String(ch));
	 }

}