import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class q1{
	JLabel l1,l2,l3,l4;
	JButton calc;
	JTextField num1,num2;
	JFrame frm;
	
	q1(){
		frm = new JFrame("calculator");
		frm.setSize(200,200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		num1 = new JTextField("Enter first number - ",10);
		num2 = new JTextField("Enter second number - ",10);
		calc = new JButton("Calculate");
		l1 = new JLabel("Sum");
		l2 = new JLabel("Difference");
		l3 = new JLabel("Product");
		l4 = new JLabel("Quotient");
		calc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				float n1 = Float.parseFloat(num1.getText());
				float n2 = Float.parseFloat(num2.getText());
				l1.setText(""+(n1+n2));
				l2.setText(""+(n1-n2));
				l3.setText(""+(n1*n2));
				l4.setText(""+(n1/n2));
			}
		});
		frm.add(num1);
		frm.add(num2);
		frm.add(calc);
		frm.add(l1);
		frm.add(l2);
		frm.add(l3);
		frm.add(l4);
		frm.setVisible(true);			
	}
	public static void main(String args[]){
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					new q1();
				}
			});
	}
}
