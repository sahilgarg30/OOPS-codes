package com.course.buildings;
import java.util.Scanner;
public class BuildingDemo{
	public static void main(String args[]){
		System.out.println("Please enter values Sqft, stories - ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Building pa = new Building(b,c);
		System.out.println(pa);
		
		System.out.println("Please enter values beds and baths - ");
		int d = sc.nextInt();
		int e = sc.nextInt();
		House hs = new House();
		hs.setSqft(b);
		hs.setStories(c);
		hs.setBed(d);
		hs.setBath(e);		
		System.out.println(hs);
		
		System.out.println("Please enter values no of classes and grade - ");
		int f = sc.nextInt();
		sc.nextLine();
		String g = sc.nextLine();
		School s = new School();
		s.setSqft(b);
		s.setStories(c);
		s.setClasses(f);
		s.setGrade(g);	
		System.out.println(s);	
	}
}
