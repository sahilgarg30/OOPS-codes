import java.util.Scanner;
import java.io.IOException;
class Number{
	String s;
	Number(String a){s=a;}
	void convert(){
		int counter=0;
		String temp="";
		for(int i=s.length()-1;i>=0;i--){
			if(counter%3!=0 || counter==0)
				temp = temp + s.charAt(i);
			else{
				temp= temp+",";
				temp=temp+s.charAt(i);
			}
			counter++;
		}
		String rev="";
		for(int i=temp.length()-1;i>=0;i--){
			rev = rev+temp.charAt(i);		
		}
		s=rev;	
	}
	void display(){
		System.out.println(s);
	}
	public static void main(String args[]) throws IOException{
		System.out.println("Please enter number - ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Number n = new Number(name);
		n.convert();
		n.display();
	}
}
