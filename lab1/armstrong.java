import java.util.Scanner;

class Armsstrong{
	public static void main(String args[]){
		System.out.println("Please enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=isArmstrong(n);
		if(sum==n)
			System.out.println("It is an armstrong number.");
		else
			System.out.println("It is not an armstrong number.");
	}
	
	static long isArmstrong(int a){
		long sum=0;
		for(int i=a;i>0;i=i/10)
			sum+=(i%10)*(i%10)*(i%10);
		return sum;
	}
}
