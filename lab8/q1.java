import java.util.Scanner;
class RowSum implements Runnable{
	Thread t;
	int arr[];
	int sum=0;
	RowSum(int a[],int s){
		arr = a;
		t = new Thread(this,"Row no. "+s);
		t.start();
	}
	public void run(){
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
	}
	int getSum(){
	 System.out.println("Sum of "+t.getName()+" is "+sum);	
	 return sum;
	}
}
class RowDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r-");
		int row,c;
		row = sc.nextInt();
		int a[][] = new int[row][];
		System.out.println("Enter size of each col-");
		for(int i=0;i<a.length;i++){
			c = sc.nextInt();
			a[i]=new int[c];
		}
		System.out.println("Enter the elements -");
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++) 
				a[i][j] = sc.nextInt();
				
		RowSum r[] = new RowSum[a.length];
		for(int i=0;i<a.length;i++){
			r[i] = new RowSum(a[i],i+1);
		}		
		int total=0;
		for(int i=0;i<r.length;i++){
			try{
			r[i].t.join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		for(int i=0;i<r.length;i++){
			total+=r[i].getSum();
		}
		System.out.println("Total is - "+total);
	}
}
