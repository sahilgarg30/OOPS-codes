package com.course.buildings;
import java.util.Scanner;
public class Building{
	private int sqft,stories;
	public Building(){}
	public Building(int a,int b){
		sqft =a;
		stories =b;
	}
	public String toString(){
		return (sqft+" "+stories);
	}
	public int getSqft() { return sqft;}
	public int getStories() { return stories;}
	public void setSqft(int a){sqft=a;}
	public void setStories(int a){stories=a;}
}
