import java.util.Scanner;
abstract class Figure{
	int a,b;
	abstract int area();
	Figure(int c,int d){a=c;b=d;}
}
class Rectangle extends Figure{
	int area(){ return a*b;}
	Rectangle(int c,int d){super(c,d);}
}
class Triangle extends Figure{
	int area(){return a*b/2;}
	Triangle(int c,int d){super(c,d);}
}
class Square extends Figure{
	int area(){ return a*a;}
	Square(int c){super(c,0);}
}
class FigureDemo{
	public static void main(String args[]){
		System.out.println("Please enter values a and b - ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("1.Rectangle 2.Triangle 3.Square ");
		int x = sc.nextInt();
		Figure f;
		if(x==1){
			f = new Rectangle(b,c);
			System.out.println("Area is "+f.area());
		}
		else if(x==2){
			f = new Triangle(b,c);
			System.out.println("Area is "+f.area());
		}
		else if(x==3){
			f = new Square(b);
			System.out.println("Area is "+f.area());
		}
}
}
