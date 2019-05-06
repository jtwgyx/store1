package my1;



import javax.swing.JFrame;


public class MyFrame10 extends JFrame{
	MyCanvas my;
	MyFrame10(){
		setSize(300,200);
		 setTitle("Canvas Demo.");
		 setLayout(null);
		 my=new MyCanvas();
		 my.setBounds(10,20,260,200);
		 this.add(my);
		 this.setLocationRelativeTo(null);
		  
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setVisible(true);
}
public static void main(String[] args){
new MyFrame10();
		  
		  
}
		
	}
	
	
	
	
	

