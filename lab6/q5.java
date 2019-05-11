import java.util.Scanner;
class Building{
	int sqft,stories;
	Building(){}
	Building(int a,int b){
		sqft =a;
		stories =b;
	}
	public String toString(){
		return (sqft+" "+stories);
	}
	int getSqft() { return sqft;}
	int getStories() { return stories;}
	void setSqft(int a){sqft=a;}
	void setStories(int a){stories=a;}
}
class House extends Building{
	private int bed;
	private int bath;
	public String toString(){
		return (bed+" "+bath+" "+getSqft()+" "+getStories());
	}
	int getBed() { return bed;}
	int getBath() { return bath;}
	void setBed(int a){bed=a;}
	void setBath(int a){bath=a;}
}

class School extends Building{
	private int classes;
	private String grade;
	public String toString(){
		return (grade+" "+classes+getSqft()+" "+getStories());
	}	
	int getClasses() { return classes;}
	void setClasses(int a){classes=a;}
	String getGrade(){ return grade;}
	void setGrade(String s){grade=s;}
}
class BuildingDemo{
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
