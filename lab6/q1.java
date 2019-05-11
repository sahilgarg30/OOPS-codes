import java.util.Scanner;
class Day{
	int year,month,date;
	Day(){}
	Day(int a,int b,int c){
		year =a;
		month =b;
		date=c;
	}
	public String toString(){
		return (date+"/"+month+"/"+year);
	}
}

class Person{
	private String name;
	private Day dob;
	
	Person(){}
	Person(String a,int b,int c,int d){
		name = a;
		dob = new Day(b,c,d);
		
	}
	String getName(){ return name;}
	Day getDob() { return dob;}
}

class CollegeGraduate extends Person{
	private float gpa;
	private int yearGrad;
	
	float getGpa() { return gpa;}
	int getYear() { return yearGrad;}
	
	void display(){
		System.out.println("\nName - "+getName()+"\nDate of birth - "+getDob()+"\nGPA - "+gpa+"\nYear of Grad - "+yearGrad+"\n");
	}
	CollegeGraduate(){}
	CollegeGraduate(String a,int b,int c,int d,float e,int f){
		super(a,b,c,d);
		gpa = e;
		yearGrad = f;
	}
	
	public static void main(String args[]){
		System.out.println("Please enter values name,gpa,year of grad,date of birth in dd/mm/yy - ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		float b = sc.nextFloat();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		CollegeGraduate student = new CollegeGraduate(a,f,e,d,b,c);
		System.out.println("The graduate is - ");
		student.display();		
	}	
}
