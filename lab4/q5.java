import java.util.Scanner;

class Counter{
	static int count;
	Counter(){ count++;}
	static void showCount(){
		System.out.println("Count is - "+count);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Counter s;
		int check=0;
		do{	
			System.out.println("Press 1 to create object. 2 to show count. 3 to exit.");
			check = sc.nextInt();
			int ele;
			switch(check){
				case 1: s=new Counter();
					break;
				case 2: Counter.showCount();
					break;
				}
		}while(check!=3);
	}
}
