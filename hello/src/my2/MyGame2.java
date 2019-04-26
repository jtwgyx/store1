package my2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyGame2 extends JFrame{
	Image jg=GameUtil.getImage("Images/jg.jpg");
	Image plane=GameUtil.getImage("Images/plane.jpg");
	int planex=100,planey=200;
	public void paint(Graphics g){//
		g.drawImage(jg,0,0,null);
		g.drawImage(plane,planex,planey,null);
		planex++;
		
	}//帮助我们反复的重画窗口
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	//初始化窗口
	public void launchFrame(){
		this.setTitle("菜鸟项目");
		this.setVisible(true);
		this.setSize(280,500);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			
			
			}
		});
		new PaintThread().start();//启动重画窗口的线程
		
		
	}
public static void main(String[] args){
	MyGame2 f=new MyGame2 ();
	f.launchFrame();
}
}

