import java.util.Scanner;
class SeatsFilledException extends Exception{
	int no;
	SeatsFilledException(int a){
		no=a;
	}
	public String toString(){
		return("The student does not exist.\nInvalid registeration number - "+ no);
	}
}
class Student{
	int regno;
	String name;
	int yoj;
	Student(int a,String b,int c) throws SeatsFilledException{
		if(a>(c%100)*100+25)
		throw (new SeatsFilledException(a));
		regno=a;
		name=b;
		yoj=c;
	}
	public String toString(){
		return ("Name -\t"+name+"\nReg. No.-"+regno);
	}
	public static void main(String args[]){
		System.out.println("Enter student name, RegNo. and year of joining - ");
		Scanner sc = new Scanner(System.in);
		int a,c;
		String b;
		b = sc.nextLine();
		a = sc.nextInt();
		c = sc.nextInt();
		try{
			Student s = new Student(a,b,c);
			System.out.println("Student details are-\n"+s);
		}catch(SeatsFilledException e){
			System.out.println(e);
		}
	}
}
