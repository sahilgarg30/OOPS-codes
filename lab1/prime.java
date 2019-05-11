import java.util.Scanner;

class Prime{
	public static void main(String args[]){
		System.out.println("Please enter n to get n Prime numbers - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<32000;i++){
			if(isPrime(i)){
				System.out.print(i+"\t");
				n--;
			}
			if(n==0) break;
		}
		System.out.println("");
	}
	
	static boolean isPrime(int a){
		for(int i=2;i<a;i++)
			if(a%i==0)	
			return false;
	return true;
	}
}
