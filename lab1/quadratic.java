import java.util.Scanner;

class Quadratic{
	public static void main(String args[]){
		System.out.println("Please enter the quadratic equation of ax^2+bx+c - ");
		System.out.println("Please enter value of a,b and c - ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = (b*b)-4*a*c;
		double d1 = Math.pow((b*b)-4*a*c,0.5);
		int check;
		double root1 =0,root2=0;
		if(d>0) check = 1;
		 else if(d<0) check = 2;
		  else check = 3;
		switch(check){
		 case 3 :
			root1 = -b/(2*a);  
			System.out.println("Roots are equal and are " + root1);
		 	break;
		 case 1 :
                        root1 = (-b+d1)/(2*a);
			root2 = (-b-d1)/(2*a);
			System.out.println("Roots are real and distinct and are " + root1 + ", "+root2+".");
			break;
		case 2:
			System.out.println("Roots are comples and distinct and are " + (-b/(2*a)) + "+ " + d/(2*a)+"i, " + (-b/(2*a)) + "- " + d/(2*a)+"i.");
	break;
		}
	}
}
