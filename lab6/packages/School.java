package com.course.buildings;
import java.util.Scanner;
public class School extends Building{
	private int classes;
	private String grade;
	public String toString(){
		return (grade+" "+classes+getSqft()+" "+getStories());
	}	
	public int getClasses() { return classes;}
	public void setClasses(int a){classes=a;}
	public String getGrade(){ return grade;}
	public void setGrade(String s){grade=s;}
}
