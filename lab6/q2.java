import java.util.Scanner;
class Day{
	int year,month,date;
	Day(){}
	Day(int a,int b,int c){
		year =a;
		month =b;
		date=c;
	}
	public String toString(){
		return (date+"/"+month+"/"+year);
	}
}
class Patient{
	private String name;
	private int age;
	private int hosno;
	
	String getName(){ return name;}
	int getAge() { return age;}
	int getHosno() { return hosno;}
	void setName(String s){name=s;}
	void setAge(int a){age=a;}
	void setHosno(int a){hosno=a;}
}
class InPatient extends Patient{
	private String deptName;
	private Day adm;
	private String roomtype;
	String getDeptName(){ return deptName;}
	Day getAdm() { return adm;}
	String getRoomtype() { return roomtype;}
	void setDeptName(String s){deptName=s;}
	void setAdm(int a,int b,int c){adm = new Day(a,b,c);}
	void setRoomtype(String a){roomtype=a;} 
}

class Billing extends InPatient{
	Day dis;
	Day getDis(){ return dis;}
	void setDis(int a,int b,int c){dis=new Day(a,b,c);} 
	void printTotal(){
		Day a = new Day(dis.year-getAdm().year,dis.month-getAdm().month,dis.date-getAdm().date);
		int no = a.year*365+a.month*30+a.date;
		float total=0;
		if(getRoomtype().equals("Special"))
			total = no*1200;
		else if(getRoomtype().equals("SemiSpecial"))
			total = no*600;
		else if(getRoomtype().equals("General"))
			total = no*150;
		System.out.println("Total is - "+total);
	}
	
	void display(){
		System.out.println("\nName - "+getName()+"\nAge - "+getAge()+"\nHospital no - "+getHosno()+"\nName of dept - "+getDeptName()		+"\nDate of admission - "+getAdm()+"\nRoomType - "+getRoomtype()+"\nDischarge date - "+dis+"\n");
	}
	
	public static void main(String args[]){
		System.out.println("Please enter values name,age,hosno - ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();
		
		Billing pa = new Billing();
		
		pa.setName(a);
		pa.setAge(b);
		pa.setHosno(c);
		
		System.out.println("Please enter values dept name,date of admission in dd/mm/yy,roomtype - ");
		a = sc.nextLine();
		b = sc.nextInt();
		c = sc.nextInt();
		int d = sc.nextInt();
		sc.nextLine();
		String e = sc.nextLine();
		
		pa.setDeptName(a);
		pa.setAdm(d,c,b);
		pa.setRoomtype(e);
		
		System.out.println("Please enter values date of discharge in dd/mm/yy- ");
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		pa.setDis(d,c,b);
		pa.printTotal();
		pa.display();	
	}	
}
