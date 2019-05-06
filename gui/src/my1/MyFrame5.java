package my1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyFrame5 extends JFrame
{
  public MyFrame5() {
	  this.setSize(300,200);
	  this.setTitle("JRadioButton Demo.");
	  this.setLayout(null);
	  JLabel sex=new JLabel("性别");
	  //
	  JRadioButton r1=new JRadioButton("男",true);
	  JRadioButton r2=new JRadioButton("女");
			  ButtonGroup bg=new ButtonGroup();
			  bg.add(r1);bg.add(r2);
			  sex.setBounds(10,20,50,30);
			  r1.setBounds(60,20,60,30);
			  r2.setBounds(130,20,60,30);
			  this.add(sex);
			  this.add(r1);
			  this.add(r2);
			  this.setLocationRelativeTo(null);
			  
			  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  this.setVisible(true);
}
public static void main(String[] args){
	new MyFrame5();
  }
}
