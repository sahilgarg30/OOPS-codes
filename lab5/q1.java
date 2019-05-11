import java.util.Scanner;
import java.io.IOException;
import java.util.GregorianCalendar;
class Student{
	int regno;
	String name;
	short sem;
	float gpa,cgpa;
	static int counter;
	GregorianCalendar doj;
	
	Student(){ 
		counter++;
		regno=counter;
		sem=0;
		gpa=cgpa=0.0f;
		name = new String();
		doj = new GregorianCalendar(0,0,0);
		regno = (doj.get(GregorianCalendar.YEAR)-2000)*100+counter;
	}
	Student(short b,float c,float d,String e,int f,int g,int h){
		counter++;
		regno=0;
		sem=b;
		gpa=c;
		cgpa=d;
		name = new String(e);
		doj = new GregorianCalendar(h,g,f);
		regno = (doj.get(GregorianCalendar.YEAR)-2000)*100+counter;
	}
	
	void display(){
		System.out.println("\nReg No - "+regno+"\nName - "+name+"\nSem - "+sem+"\nGPA - "+gpa+"\nCGPA - "+cgpa+"\nDate of joining - 			"+doj.get(GregorianCalendar.DATE)+doj.get(GregorianCalendar.MONTH)+doj.get(GregorianCalendar.YEAR)+"\n");	
	}
	
	static void nameStartsWith(Student a[]) throws IOException{
		System.out.println("Enter the character that the name must begin with - ");
		char x;
		x = (char)System.in.read();
		for(int i=0;i<a.length;i++){
			if(a[i].name.charAt(0)==x)
				System.out.print(a[i].name+"\t");
		}
		System.out.println("");
	}
	static void sortName(Student s[]){
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s.length-i-1;j++){
				if(s[j].name.compareTo(s[j+1].name)>0){
					Student temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	static void sortSem(Student s[]){
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s.length-i-1;j++){
				if(s[j].sem>s[j+1].sem){
					Student temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s.length-i-1;j++){
				if(s[j].sem==s[j+1].sem && s[j].cgpa<s[j+1].cgpa){
					Student temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	static void haveSubstring(Student s[]){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for(int i=0;i<s.length;i++){
			if(s[i].name.indexOf(a)!=-1){
				System.out.print(s[i].name+"\t");
			}
		}
	}
	static void changeName(Student s[]){
		int j=0;
		for(int i=0;i<s.length;i++){
			int nw=0;
			for(j=0;j<s[i].name.length();j++)
				if(s[i].name.charAt(j)==' ' && s[i].name.charAt(j+1)!=' ') nw++;
			String newName="";
			newName = newName + s[i].name.charAt(0);
			for(j=0;j<s[i].name.length();j++){
				if(s[i].name.charAt(j)==' ' && s[i].name.charAt(j+1)!=' '){
					newName = newName + s[i].name.charAt(j);
					newName = newName + s[i].name.charAt(j+1);
					nw--;
					if(nw==0)
					break;
				}
			}
			j+=2;
			for(;j<s[i].name.length();j++)
			newName =  newName + s[i].name.charAt(j);
			s[i].name = newName;
		}
	}
	
	public static void main(String args[]) throws IOException{
		System.out.println("Please enter name, sem, gpa, cgpa and date of joining for 5 students - ");
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		for(int i=0;i<5;i++){
			String name = sc.nextLine();
			short sem = sc.nextShort();
			float gpa = sc.nextFloat();
			float cgpa = sc.nextFloat();
			int d = sc.nextInt();
			int m = sc.nextInt();
			int y = sc.nextInt();
			sc.nextLine();
			s[i] = new Student(sem,gpa,cgpa,name,d,m,y);
		}
		for(int i=0;i<5;i++){
			s[i].display();
		}
		sortName(s);
		for(int i=0;i<5;i++){
			s[i].display();
		}
		sortSem(s);
		for(int i=0;i<5;i++){
			s[i].display();
		}
		nameStartsWith(s);
		sc.nextLine();
		haveSubstring(s);	
		changeName(s);
		for(int i=0;i<5;i++){
			s[i].display();
		}
		
	}		
}
