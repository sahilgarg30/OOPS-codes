import java.awt.*;
import java.applet.*;
/*<applet code = "Q1" width = 300 height = 50></applet>*/
public class Q1 extends Applet{
	String msg;
	public void init(){setBackground(Color.yellow);
		msg = "init -> ";	
	}
	public void start(){msg += "start -> ";}
	public void paint(Graphics g){
		msg+=" paint ->";
		g.setColor(Color.blue);
		g.drawString("Welcome to applet programming",10,20);
		g.drawString(msg,20,40);
		showStatus("This is status window");
	}	
}
