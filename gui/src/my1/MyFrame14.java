package my1;

//import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame14 extends JFrame{
	JLabel label;
	JTextArea txt;
	JButton btn;
	JTextField txtInput;
	
	MyFrame14(){
		this.setSize(600,400);
		this.setTitle("BorderLayout Demo");
		//因为JFframe的默认布局为BorderLayout,则不需要更改布局设置
		
		
		label=new JLabel("发言：");
		 txt=new JTextArea ();
	    btn=new JButton("发送");
		 txtInput=new JTextField();
//		btn.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				txt.append(txtInput.getText()+"\n");
//				txtInput.setText("");
//				
//			}
//			
//		});实现方法3
			
		 
		 
		 txt.setEditable(false);
		 JPanel jp=new JPanel();
		 jp.setLayout(new BorderLayout());
		 jp.add(label,BorderLayout.WEST);
		 jp.add(btn,BorderLayout.EAST);
		 jp.add(txtInput,BorderLayout.CENTER);
		 this.add(jp,BorderLayout.SOUTH);
		 this.add(txt,BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame14();
      
	}

}
  
 
