import java.util.Scanner;
interface Stack{
	void push(int b);
	int pop();
}
class FixedStack implements Stack{
	int top=-1;
	int a[];
	FixedStack(){ a = new int[2];}
	public void push(int b){
		if(top<1) a[++top]=b;
		else System.out.println("Stack is full.");
	}
	public int pop(){
		if(top>-1) return a[top--]; 
		else {System.out.println("Stack is empty.");return -32000;}
	}
	void display(){
		for(int i=0;i<=top;i++) System.out.println(a[i]+"\t");
	}
}
class DynamicStack implements Stack{
	int top=-1;
	int a[];
	int size=2;
	DynamicStack(){ a = new int[2];}
	public void push(int b){
		if(top>=size-1) increaseSize();
		 a[++top]=b;
		 
	}
	public int pop(){
		if(top>-1) return a[top--]; 
		else {System.out.println("Stack is empty.");return -3200;}
	}
	void display(){
		for(int i=0;i<=top;i++) System.out.println(a[i]+"\t");
	}
	void increaseSize(){
		int b[] = new int[2*size];
		for(int i=0;i<=top;i++)
		b[i]=a[i];
		a=b;
		size*=2;
	}
}
class StackDemo{
	public static void main(String args[]){
	Stack s;
	FixedStack fs= new FixedStack();
	DynamicStack ds = new DynamicStack();
	s=fs;
	s.push(1);
	s.push(2);
	s.push(3);
	fs.display();
	s.pop();
	fs.display();
	s=ds;
	s.push(1);
	s.push(2);
	s.push(3);
	ds.display();
	s.pop();
	ds.display();
	}	
}
