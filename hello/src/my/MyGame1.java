package my;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

public class MyGame1 extends JFrame{
	Image jg=GameUtil.getImage("Images/jg.png");
	Image planeImg=GameUtil.getImage("Images/plane.jpg");
	Plane plane=new Plane(planeImg,100,200);
	Explode bao;
	  Date startTime=new Date();
	  Date endTime;
	     int period;//游戏持续的时间
	Shell shells[]=new Shell[50];//声明炮弹
	public void paint(Graphics g){
		g.drawImage(jg,0,0,null);
		plane.drawSelf(g);//画飞机
		
		//画出所有炮弹
		for(int i=0;i<shells.length;i++) {
		shells[i].draw(g);
		boolean peng=shells[i].getRect().intersects(plane.getRect());
		if(peng) {
			
			plane.live=false;
			//爆炸的判断及声明
			if(bao==null) {
			bao=new Explode(plane.x,plane.y);
			endTime=new Date();
			period=(int)((endTime.getTime()-startTime.getTime())/1000);
			}
			
	bao.draw(g);
		}
		
		if(!plane.live) {
		
		g.setColor(Color.red);
		Font f=new Font("宋体",Font.BOLD,50);
		g.setFont(f);
		g.drawString("时间:"+period+"秒",(int)plane.x,(int)plane.y);
		}}
		
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
	
	
	
	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e)
		{plane.addDirection(e);
			// TODO Auto-generated method stub
			super.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e)
		{plane. minusDirection(e); 
			
			// TODO Auto-generated method stub
			super.keyReleased(e);
		}
		
	}
	
	
	
	
	
	
	//初始化窗口
	public void launchFrame(){
		this.setTitle("菜鸟项目");
		this.setVisible(true);
		this.setSize(500,520);
		this.setLocation(300,520);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			
			
			}
		});
		new PaintThread().start();//启动重画窗口的线程
		addKeyListener(new KeyMonitor());
		
		//初始化炮弹
		for(int i=0;i<shells.length;i++) {
			shells[i]=new Shell();
		}
	}
	
	
public static void main(String[] args){
	MyGame1 f=new MyGame1 ();
	f.launchFrame();
}

private Image offScreenImage = null;

public void update(Graphics g) {
    if(offScreenImage == null)
        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
     
    Graphics gOff = offScreenImage.getGraphics();
    paint(gOff);
    g.drawImage(offScreenImage, 0, 0, null);
}   }