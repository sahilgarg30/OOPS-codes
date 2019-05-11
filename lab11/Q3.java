import java.awt.*;
import java.applet.*;
import java.util.Scanner;
/*<applet code = "Q3" width = 300 height = 500>
</applet>*/
public class Q3 extends Applet implements Runnable{
	String msg = "Java rules the world!";
	Thread t;
	boolean stopFlag;
	public void init(){
		setBackground(Color.red);
		setForeground(Color.red);
		t = null;
	}
	public void start(){t = new Thread(this);
		stopFlag = false;
		t.start();}
		
	public void run(){
		for(;;){
			try{
				repaint();
				Thread.sleep(100);
				if(stopFlag) break;
			}catch(InterruptedException e){}
		}
	}
	public void stop(){ stopFlag = true;
		t = null;
	}
	public void paint(Graphics g){
		g.setColor(Color.blue);
		char ch = msg.charAt(0);
		msg = msg.substring(1);
		msg+=ch;
		g.drawString(msg,30,10);
	}
}
