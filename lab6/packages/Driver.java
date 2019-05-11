import java.util.Scanner;
import p1.Max;
class Driver{
public static void main(String args[]){
		System.out.println("Please enter values integer a,b,c - ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		a = Max.max(a,b,c);
		System.out.println("The maximum is - "+a);
		System.out.println("Please enter values float a,b,c - ");
		float d = sc.nextFloat();
		float e = sc.nextFloat();
		float f = sc.nextFloat();
		d = Max.max(d,e,f);
		System.out.println("The maximum is - "+ d);
		int arr[]={4,5,6};
		a = Max.max(arr);
		System.out.println("The maximum is - "+ a);
}
}
