package my1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame 
{
	JLabel j1,j2;
	JTextField uTxt;
	JPasswordField pTxt;
	JButton btn;
	 private MyFrame2(){
		  this.setSize(300,200);
		  this.setTitle("这是一个JFrame程序");
		  this.setLayout(null);
		  
		  j1=new JLabel("账号：");
		  j2=new JLabel("密码：");
		    uTxt=new JTextField(20);
		    pTxt=new JPasswordField(20);
		    btn=new JButton("登录");
		     
		    
		    j1.setBounds(30,55,60,26);
		     j2.setBounds(30,80,60,26);
		     uTxt.setBounds(95,55,120,26);
		     pTxt.setBounds(95,80,120,26);
		     btn.setBounds(150,110,60,30);
		     
		     this.add(j1);
		     this.add(j2);
		     this.add(uTxt);
		     this.add(pTxt);
		     this.add(btn);
		     this.setLocationRelativeTo(null);
			  
			  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  this.setVisible(true);
}
public static void main(String[] args){
	new MyFrame2();
		     
	  }

}
