import java.awt.*;
import java.applet.*;
import java.util.Scanner;
/*<applet code = "Q4" width = 500 height = 50>
<param name = "num1" value = 66>
<param name = "num2" value = 24>
</applet>*/
public class Q4 extends Applet{
	int num1,num2;
	int GCD(int n,int m){
		if(m==0) return n;
		return GCD(m,n%m);
	}
	public void start(){
		num1 = Integer.parseInt(getParameter("num1"));
		num2 = Integer.parseInt(getParameter("num2"));
	}
	public void paint(Graphics g){
		g.drawString("GCD of "+ num1+ " and " + num2+" is "+GCD(num1,num2),10,10);
	}
}
