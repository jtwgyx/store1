package my1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame6 extends JFrame
{public MyFrame6(){
	this.setSize(300,200);
	this.setTitle("JCheckBox Demo.");
	this.setLayout(null);
	JLabel in=new JLabel("兴趣");
	JCheckBox c1=new JCheckBox("java");
	JCheckBox c2=new JCheckBox("C CSharp");
	in.setBounds(10,20,50,30);
	c1.setBounds(60,20,80,30);
	c2.setBounds(140,20,80,30);
	add(in);
	add(c1);add(c2);
	 this.setLocationRelativeTo(null);
	  
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
}
public static void main(String[] args){
new MyFrame6();
    
}



	
	
}


