package com.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hackerrank {

	private static int B;
	private static int H;
	private static boolean flag = true;
	
	static{
		Scanner scn = new Scanner(System.in);
		B = scn.nextInt();
		H = scn.nextInt();
		
		if(B <= 0 || H <= 0){
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
		
		scn.close();
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
//		
//	      
//	      Scanner in = new Scanner(System.in);
//	      int testCases = Integer.parseInt(in.nextLine());
//	      while(testCases>0){
//	         String line = in.nextLine();
//	             //Write your code here
//	         Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
//	         Matcher m = p.matcher(line);
//	         boolean f = true;
//	         while(m.find()){
//	             System.out.println(m.group(2));
//	             f = false;
//	         }
//	         if(f){
//	             System.out.println("None");
//	         }
//	         testCases--;
//	      }   
	   }
	
}
