import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.util.Random;
/*
 <object CODE="q4.class" WIDTH=400 HEIGHT=200>
 </object>
 */
 public class q4 extends JApplet
 {
 	int x,y,p,q;
    JButton b;
    JLabel l1,l2,l3,l4;
    String s="";
 	public void start()
 	{
        setLayout(new FlowLayout());	
	    b=new JButton("Circle");
        add(b); 
        l1=new JLabel("Area");
        add(l1);
        l2=new JLabel("Radius");
        add(l2);
        l3=new JLabel("Diameter");
        add(l3);
        l4=new JLabel("Circumference");
        add(l4);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
 			{       s="Circle";  
 					repaint();
 				}
            });

 	}
 	public void paint(Graphics g){
        
 		super.paint(g);
 		g.setColor(Color.blue);
        Random r=new Random();
        int rad=r.nextInt(50)+50;
 		g.drawOval(100,100,rad,rad);
 		double area= 3.142*rad*rad;
 		double dia = 2*rad;
 		double circum = 2*3.142*rad;
 		l1.setText("Area is "+area);
 		l2.setText("Radius is "+rad);
 		l3.setText("Diameter is "+dia);
 		l4.setText("Circumference is "+circum);
 		
 		
 	}
}
