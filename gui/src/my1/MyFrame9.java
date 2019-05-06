package my1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyFrame9 extends JFrame
{Object[][] rowData;
 Object[] columnNames;
 JTable tab;
 
 JScrollPane sp;
 MyFrame9(){
	 setSize(300,200);
	 setTitle("JTable Demo.");
	 setLayout(null);
	 rowData=new Object[][] {{"张三","男",19,"软件1709"},{"李四","男",20,"软件1703"},{"王五","男",19,"软件1703"},{"赵六","男",20,"软件1706"}};
	 columnNames=new Object[] {"姓名","性别","年龄","班级"};
	 tab=new JTable(rowData,columnNames);
	 sp=new JScrollPane(tab);
	 sp.setBounds(10,20,260,80);
	 this.add(sp);
	 this.setLocationRelativeTo(null);
	  
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
}
public static void main(String[] args){
new MyFrame9();
	  
	  
}
	 }

 
