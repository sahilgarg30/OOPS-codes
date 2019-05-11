import java.util.Scanner;
interface Series{
	void reset();
	int getNext();
	void setStart(int a);
}
class ByTwos implements Series{
	int val;
	public void reset(){val=0;}
	public void setStart(int a){val=a;}
	public int getNext(){
		val+=2;
		System.out.println("Val - "+ val);return val;}
}
class SeriesDemo{
	public static void main(String args[]){
	Series a;
	ByTwos b = new ByTwos();
	a =b;
	a.reset();
	a.getNext();
	a.getNext();
	a.setStart(5);
	a.getNext();
	}	
}
