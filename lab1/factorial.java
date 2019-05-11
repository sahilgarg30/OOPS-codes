import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		System.out.println("Please enter n and r to get nCr - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		long c = fact(n)/(fact(r)*fact(n-r));
		System.out.println("nCr is - "+c+".");
	}
	
	static long fact(int a){
		long b=1;
		for(int i=1;i<=a;i++)
			b*=i;
		return b;
	}
}
