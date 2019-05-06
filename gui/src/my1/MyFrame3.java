package my1;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame3 extends JFrame
{JTextArea txt=null;
//初始化窗口
  MyFrame3(){
	 this.setSize(300,200);
	this.setTitle("JTextArea Demo.");
	 this.setLayout(null);//将默面板设置为空
	 
	 txt=new JTextArea("好好学习，天天向上，早日脱单",30,60);
	 txt.setBounds(6,6,200,100);//设置组件显示位置大小
	 this.add(txt);  //将以上组件添加到窗口窗体中
	
	 
	 
	 this.setLocationRelativeTo(null);
	  
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
}
public static void main(String[] args){
new MyFrame3();
 }

}
