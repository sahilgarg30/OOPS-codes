import java.awt.*;
import java.applet.*;
import java.util.Scanner;
/*<applet code = "Q2" width = 300 height = 500>
<param name = number value = 7>
</applet>*/
public class Q2 extends Applet{
	int n;
	Scanner sc;
	public void init(){
		sc = new Scanner(System.in);	
	}
	public void start(){System.out.println("Enter num:");n = sc.nextInt();}
	public void paint(Graphics g){
		for(int i=1;i<=10;i++)
		g.drawString(n+ " * "+(i)+" = "+(n*i),20,10*i+20);
	}	
}
