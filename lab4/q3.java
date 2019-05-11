import java.util.Scanner;
import java.io.IOException;
class Card{
	private int rank;
	private char suit;
	
	Card(int a,char b){
		rank=a;
		suit=b;
	}
	
	char getSuit(){ return suit;}
	int getRank(){ return rank;}
}

class CardTester{
	public static void main(String args[]) throws IOException{
		System.out.println("Please enter values rank and suit for 5 cards - ");
		Scanner sc = new Scanner(System.in);
		Card c[] = new Card[5];
		for(int i=0;i<5;i++){
			int a = sc.nextInt();
			char b = (char)System.in.read();
			c[i] = new Card(a,b);
		}
		
		int r1,r2;
		
		r1 = c[0].getRank();
		r2 = r1;
		for(int i=1;i<5;i++){
			if(c[i].getRank()!=r1){
				r2=c[i].getRank();break;
			}
		}
		
		int c1=0,c2=0;
		for(int i=0;i<5;i++){
			if(c[i].getRank()==r1){
				c1++;
			}
			else if(c[i].getRank()==r2){
				c2++;
			}
		}
		if((c1==2 && c2==3)||(c1==3 && c2==2))
		  System.out.println("Full House.");
		else
		  System.out.println("Not a full House.");
		  
		System.out.println("Cards are - ");
		for(int i=0;i<5;i++)
		  System.out.println("Rank - "+c[i].getRank()+" Suit - "+c[i].getSuit());
	}
}
