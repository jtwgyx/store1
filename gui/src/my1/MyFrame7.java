package my1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class MyFrame7 extends JFrame {
	public MyFrame7(){
    this.setSize(300,200);
      this.setTitle("JList Demos.");
      this.setLayout(null);
     //
      JLabel in=new JLabel("兴趣:");
      Object[] o=new Object[]{"java","c","html","jsp"};
      //
      JList list=new JList(o);
      //
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      in.setBounds(10,20,50,30);
      list.setBounds(10,55,100,100);
      this.add(in);
      this.add(list);
      //
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame7();
      
      
      

	}
	
	

}

