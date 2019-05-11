import java.util.Scanner;

class OddEven{
	public static void main(String args[]){
		System.out.println("Please enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd=0,even=0;
		int a[] = new int[100];
		System.out.println("Please enter all the n numbers - ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("The number of odd numbers are - " + odd + ".");
		System.out.println("The number of even numbers are - " + even + ".");
	}
}
