import java.util.Scanner;
class DisplayTable extends Thread{
	int no;
	Table t;
	DisplayTable(Table t,int x){no=x;start();this.t=t;}
	public void run(){
		synchronized(t){
		t.display(no);
		}
	}
}
class Table{
	//synchronized 
	void display(int x){
		for(int i=1;i<=10;i++)
		System.out.println(x+" X "+i+" = "+(x*i));
	}
}
class TableDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		Table t = new Table();
		DisplayTable t1 = new DisplayTable(t,n);
		DisplayTable t2 = new DisplayTable(t,7);
		//DisplayTable t3 = new DisplayTable(t,n);		
	}
}
