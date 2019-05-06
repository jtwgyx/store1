package my1;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyFrame8 extends JFrame
{  public MyFrame8() {
	 this.setSize(300,200);
     this.setTitle("JList Demos.");
     this.setLayout(null);
    //
     JLabel in=new JLabel("兴趣:");
     Object[] o=new Object[]{"java","c","html","jsp"};
     JComboBox cb=new JComboBox(o);
      cb.setEditable(true);
      in.setBounds(10,20,50,30);
      cb.setBounds(10,55,100,30);
      this.add(in);
      this.add(cb);
      //
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame8();
      
      
      

	}
	
	




}


