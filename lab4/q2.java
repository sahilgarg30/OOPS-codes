import java.util.Scanner;

class Time{
	int hr,min,sec;
	Time(){ hr=min=sec=0;}
	Time(int sec){
		this.hr = sec/3600;
		sec = sec%3600;
		this.min = sec/60;
		sec = sec%60;
		this.sec= sec;
	}
	Time(int sec,int min){
		this.hr=0;
		this.min=min;
		this.sec=sec;
		long lt3 = this.convert();
		this.hr = (int)lt3/3600;
		lt3 = (int)lt3%3600;
		this.min = (int)lt3/60;
		lt3 = (int)lt3%60;
		this.sec= (int)lt3;
	}
	Time(int sec,int min,int hr){
		assign(hr,min,sec);
	}
	void assign(int a,int b,int c){		
		this.hr=a;
		this.min=b;
		this.sec=c;
		long lt3 = this.convert();
		this.hr = (int)lt3/3600;
		lt3 = (int)lt3%3600;
		this.min = (int)lt3/60;
		lt3 = (int)lt3%60;
		this.sec= (int)lt3;
	}
	void display(){
		System.out.println(hr+" : "+ min + " : " + sec);
	}
	Time add(Time t2){
		Time t3 = new Time();
		long lt1 = this.convert();
		long lt2 = t2.convert();
		long lt3 = lt1+lt2;
		t3.hr = (int)lt3/3600;
		lt3 = (int)lt3%3600;
		t3.min = (int)lt3/60;
		lt3 = (int)lt3%60;
		t3.sec= (int)lt3;
		return t3;
	}
	
	Time subtract(Time t2){
		Time t3 = new Time();
		long lt1 = this.convert();
		long lt2 = t2.convert();
		long lt3;
		if(lt1>lt2)
		lt3 = lt1-lt2;
		else
		lt3 = lt2-lt1;
		t3.hr = (int)lt3/3600;
		lt3 = (int)lt3%3600;
		t3.min = (int)lt3/60;
		lt3 = (int)lt3%60;
		t3.sec= (int)lt3;
		return t3;
	}
	
	int compare(Time t2){
		Time t3 = new Time();
		long lt1 = this.convert();
		long lt2 = t2.convert();
		long lt3 = lt1-lt2;
		if(lt3>0) return 1;
		if(lt3<0) return 2;
		return 0;
	}
	
	long convert(){
		long lt1 = this.hr*3600+this.min*60+this.sec;
		return lt1;
	}
	public static void main(String args[]){
		System.out.println("Please enter values hr,min and sec for 2 Time objects - ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();
		Time a = new Time();
		a.assign(a1,b1,c1);
		Time b = new Time();
		b.assign(a2,b2,c2);
		Time c = a.add(b);
		Time d = a.subtract(b);
		System.out.println("The sum of times is - ");
		c.display();		
		System.out.println("The difference of times is - ");
		d.display();
		int val = a.compare(b);
		if(val==1) System.out.println("The first time is greater.");
		else if(val==2) System.out.println("The second time is greater.");
		else System.out.println("Both the times are same.");
	}	
}
	

