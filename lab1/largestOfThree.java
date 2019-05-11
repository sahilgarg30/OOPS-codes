import java.util.Scanner;

class LargestOfThree {
	public static void main(String args[]){
		System.out.println("Please enter 3 numbers - ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		c = largest(a,b,c);
		System.out.println("The largest number is - "+c+".");
	}
	
	static double largest(double a,double b,double c){
		if(a>b){
			if(a>c) return a;
			else return c;
		}
		else{
			if(b>c) return b;
			else return c;
		}
	}
}
