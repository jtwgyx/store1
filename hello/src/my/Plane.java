package my;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

//飞机的实现
public class Plane extends GameObject
{  int speed=3;//定义速度
	boolean left,up,right,down;
	boolean live=true;
	
	
	
	public void drawSelf(Graphics g) {
		
		if(live) {
			 g.drawImage(img,(int )x,(int) y,null);//将x,y强制转换成整型

			   if(left) {
			   x-=speed;
			    }
			if(up) {
				y-=speed;
				}
				if(right) {
					x+=speed;
					}
					if(down){
						y+=speed;
		}
					
	 }
		
		
		else {
		 //如果碰撞则飞机消失
	 }
		}
	
		
	
	



	public Plane(Image img, double x, double y)
	{
		super(img,x,y);
		this.x=x;
		this.y=y;
		this.img=img;
		this.speed=3;
		this.width=img.getWidth(null);
				this.height=img.getHeight(null);
		
		// TODO Auto-generated constructor stub
	}
	public void addDirection(KeyEvent e) {
		switch (e.getKeyCode()){
			case KeyEvent.VK_LEFT:
				left=true;
				break;
			case KeyEvent.VK_UP:
				up=true;
				break;
			case KeyEvent.VK_RIGHT:
				right=true;
				break;
			case KeyEvent.VK_DOWN:
				down=true;
				break;
		}
		
	}
	
	public void minusDirection(KeyEvent e) {
		switch (e.getKeyCode()){
			case KeyEvent.VK_LEFT:
				left=false;
				break;
			case KeyEvent.VK_UP:
				up=false;
				break;
			case KeyEvent.VK_RIGHT:
				right=false;
				break;
			case KeyEvent.VK_DOWN:
				down=false;
				break;
	
}}}

