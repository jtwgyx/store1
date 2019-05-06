package my1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

//画布，应用程序可以在该区域进行绘图，或者在该区域捕获用户的相关事件
public class MyCanvas extends Canvas
{public void paint(Graphics g) {
	g.setColor(Color.RED);
g.drawString("这是一个Canvas程序",20 ,20);
g.setColor(Color.BLUE);
g.drawRect(20,25,100,20);
g.setColor(Color.BLACK);
g.drawOval(20, 65, 65, 60);




}

}