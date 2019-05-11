import java.util.Scanner;

class Complex{
	double a,b;
	Complex(){
		a = 0;
		b=0;
	}
	Complex(double a, double b){
		this.a=a;
		this.b=b;
	}
	void assign(double a,double b){
		this.a=a;
		this.b=b;
	}

	void display(){
		System.out.println(a+" + i "+b);
	}
	
	Complex add(Complex c2){
		Complex c3 = new Complex();
		c3.a = this.a + c2.a;
		c3.b = this.b + c2.b;
		return c3;	
	}
	
	Complex subtract(Complex c2){
		Complex c3 = new Complex();
		c3.a = this.a - c2.a;
		c3.b = this.b - c2.b;
		return c3;	
	}
	
	public static void main(String args[]){
		System.out.println("Please enter values a and b for 2 complex numbers - ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		Complex extra = new Complex(3.3,4.5);
		Complex a = new Complex();
		a.assign(a1,b1);
		Complex b = new Complex();
		b.assign(a2,b2);
		Complex c = a.add(b);
		Complex d = a.subtract(b);
		System.out.println("The sum of complex numbers is - ");
		c.display();		
		System.out.println("The difference of complex numbers is - ");
		d.display();
	}	
}
