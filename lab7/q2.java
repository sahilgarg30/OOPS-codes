import java.util.Scanner;
import java.io.IOException;
class Employee{
	 String name;
	 Integer age;
	 Double sal;
	 Float homesal;
	 Character grade;
	 
	void display(){
		System.out.println("\nName - "+name+"\nAge - "+age+"\nSalary - "+sal+"\nHomeSalary -"+homesal+"\nGrade -"+grade);
	}
	
	void input(){
		System.out.println("Please enter values name,age,salary,home salary and grade - ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		age = sc.nextInt();
		sal = sc.nextDouble();
		homesal = sc.nextFloat();
		try{
		grade = (char)System.in.read();
		}catch(IOException e){
			System.out.println("Invalid character.");
		}
		
	}
	
	public static void main(String args[]){
		int choice;
		Employee e = new Employee();
		do{
		System.out.println("1 input, 2 display ,3 exit- ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice){
		case 1: e.input();
			break;
		case 2: e.display();
			break;
		}
		}while(choice!=3);
	}	
}

