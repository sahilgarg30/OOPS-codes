import java.util.Scanner;

class Stack{
	int top;
	int arr[];
	void assign(){
		this.top=-1;
		this.arr = new int[100];
	}
	boolean isFull(){
	if(top>=arr.length) return true;
	return false;
	}
	boolean isEmpty(){
	if(top==-1) return true;
	return false;
	}
	void push(int ele){
		if(isFull())
			System.out.println("Stack is full. Overflow.");
		else
			arr[++top]=ele;
	}
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty. Underflow.");
			return -31999;}
		else
			return arr[top--];	
	}
	void display(){
		for(int i=0;i<=top;i++)
			System.out.print(arr[i]+"\t");
		System.out.print("\n");
	}
	public static void main(String args[]){
		Stack s = new Stack();
		s.assign();		
		int check=0;
		Scanner sc = new Scanner(System.in);
		do{	
			System.out.println("Press 1 to push. 2 to pop. 3 to display. 4 to exit.");
			check = sc.nextInt();
			int ele;
			switch(check){
				case 1: System.out.println("Enter value to be inserted - ");
					ele = sc.nextInt();
					s.push(ele);
					break;
				case 2: ele = s.pop();
					if(ele!=-31999)
					System.out.println("The value "+ ele + " is popped out.");
					break;
				case 3: s.display();
					break;	
				}
		}while(check!=4);
	}
}
