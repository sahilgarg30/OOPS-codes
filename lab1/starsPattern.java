import java.util.Scanner;

class StarsPattern {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines - ");
		double n = sc.nextInt();
		System.out.println("The pattern is - ");
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++)	
				System.out.print("*");
		System.out.println("");		
		}
	}
}
