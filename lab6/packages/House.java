package com.course.buildings;
import java.util.Scanner;
public class House extends Building{
	private int bed;
	private int bath;
	public String toString(){
		return (bed+" "+bath+" "+getSqft()+" "+getStories());
	}
	public int getBed() { return bed;}
	public int getBath() { return bath;}
	public void setBed(int a){bed=a;}
	public void setBath(int a){bath=a;}
}

