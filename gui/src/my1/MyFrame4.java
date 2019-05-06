package my1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFrame4 extends JFrame
{JTextArea txt=null;
//初始化窗口
  MyFrame4(){
	 this.setSize(300,200);
	this.setTitle("JScrollPane Demo.");
	 this.setLayout(null);//将默面板设置为空
	 
	 txt=new JTextArea("好好学习，天天向上，早日脱单",30,60);
	 JScrollPane jsp=new JScrollPane(txt);
	 jsp.setBounds(10,10,200,60);
	 
	this.add(jsp);
	 
	 
	 this.setLocationRelativeTo(null);
	  
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
}
public static void main(String[] args){
new MyFrame4();
 }

}
