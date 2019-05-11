import java.util.Scanner;
class Stack<T>{
	T[] ob;
	int top=-1;
	Stack(){
		ob=(T[])new Object[10];
	}
	T top(){
		if(top>-1)
		return ob[top];
		else return null;
	}
	T pop(){
		if(top>-1){
		return ob[top--];
		}
		else{ 
		 System.out.println("Stack empty.");
		 return null;
		}
	}
	void push(T o){
		if(top<100){
			ob[++top]=o;
		}
		else
		System.out.println("Stack full.");	
	}
	void display(){
		for(int i=0;i<=top;i++){
			System.out.println(ob[i]);
		}
	}
}
class Student{
	String name;
	int id;
	Student(String a,int b){
		name=a;id=b;
	}
	public String toString(){ return ("Name - "+name+"\tID - "+id);}
}
class Employee{
	String company;
	String name;
	int pay;
	Employee(String a,String c,int b){
		company=a;pay=b;name=c;
	}
	public String toString(){ return ("Name - "+name+"\tPay - "+pay+"\tCompany - "+company);}
}
class StackDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Stack<Student> s = new Stack<Student>();
		Stack<Employee> e = new Stack<Employee>();
		System.out.println("Enter name and id for 5 students - ");
		for(int i=0;i<5;i++){
			String a = sc.nextLine();
			int b= sc.nextInt();
			sc.nextLine();
			Student s1 = new Student(a,b);
			s.push(s1);
		}
		s.pop();
		s.display();
			
	}
}
