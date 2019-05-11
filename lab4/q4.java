import java.util.Scanner;

class BankAccount{
	String name;
	int accno;
	String acctype;
	double balance;
	static float interest=8.0f;
	static int count;
	
	BankAccount(){
		count++;
		accno=count;
		name = new String();
		balance=0;
		acctype = new String();
	}
	
	BankAccount(String a,String b,long d){
		count++;
		accno=count;
		name = new String(a);
		balance=d;
		acctype = new String(b);	
	}
	BankAccount(BankAccount b){
		count++;
		accno=count;
		name = new String(b.name);
		balance=b.balance;
		acctype = new String(b.acctype);	
	}
	
	static void displayRate(){
		System.out.println("Rate is - "+interest);
	}
	void display(){
		System.out.println("Name - "+ name + "\nAccNo - " +accno +"\nBalance - "+balance+"\nAccount type - "+acctype+"\n");
	}
	void withdraw(){
			System.out.println("Enter money to be withdrawn - ");
			Scanner sc = new Scanner(System.in);
			int val = sc.nextInt();
			if(balance-val>1000){
				balance-=val;
				System.out.println("Successfully withdrawn.");
				}
			else
				System.out.println("Balance less than 1000. Unsuccessful.");
	}
	void deposit(){
		System.out.println("Enter money to be deposited - ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();	
		balance+=val;
		System.out.println("Successfully deposited.");
	}
	public static void main(String args[]){
		System.out.println("Please enter values name,account type and balance - ");
		Scanner sc = new Scanner(System.in);
		String a;String b;long d;
		a = sc.nextLine();
		b = sc.nextLine();
		d = sc.nextLong();
		BankAccount s = new BankAccount(a,b,d);
		int check=0;
		do{	
			System.out.println("Press 1 to deposit. 2 to withdraw. 3 to display. 4 to display rate. 5 to exit.");
			check = sc.nextInt();
			int ele;
			switch(check){
				case 1: s.deposit();
					break;
				case 2: s.withdraw();
					break;
				case 3: s.display();
					break;	
				case 4: s.displayRate();
					break;
				}
		}while(check!=5);
	}
}
