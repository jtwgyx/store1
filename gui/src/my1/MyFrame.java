package my1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	JLabel j1=null;
	JLabel j2=null;
	JLabel j3=null;
	
	public MyFrame(){
		  setSize(300,200);
		  setTitle("这是一个Java程序");
		  setLayout(null);
		  
		  
		  j1=new JLabel("文字标签");
				  ImageIcon ii=new ImageIcon("java.jpg");
				  j2=new JLabel(ii);
				  
				  j3=new JLabel("图片+文字",ii,JLabel.RIGHT);
				  

				  j1.setBounds(50,50,120,26);
				  j2.setBounds(120,50,60,26);
				  j3.setBounds(10,90,260,26);
				  
				  
				  add(j1);
				  add(j2);
				  add(j3);
				  this.setLocationRelativeTo(null);
				  
				  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				  this.setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame();
				  
				  
	}
	
	
}

