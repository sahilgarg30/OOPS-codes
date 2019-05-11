import java.util.Scanner;

class SumOfDigits{
	public static void main(String args[]){
		System.out.println("Please enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=findSum(n);
		System.out.println("The sum is - "+sum);
	}
	
	static long findSum(int a){
		long sum=0;
		for(int i=a;i>0;i=i/10)
			sum+=i%10;
		return sum;
	}
}
