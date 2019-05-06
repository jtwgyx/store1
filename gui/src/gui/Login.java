
package gui;

 

import java.awt.Container;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPasswordField;

import javax.swing.JTextField;

import javax.swing.WindowConstants;

 

/**

 * 登陆窗口

 * @author web

 *

 */

public class Login {

 

	public static void main(String[] args) {

		new LoginJFrame();

	}

 

}

/**

 * 登陆窗口类

 * @author web

 *

 */

class LoginJFrame extends JFrame {

 

	/**

	 * 序列化的版本编号

	 */

	private static final long serialVersionUID = -107654551461824083L;

 

	public LoginJFrame() {

		setTitle("登陆");													//设置标题栏

		setSize(400, 300);													//设置窗口大小

		setLocation(650, 300);												//设置窗口位置		

		setResizable(false);												//设置不可更改窗口大小

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);			//设置关闭方式

		

		Container container = getContentPane();								//添加一个容器

		container.setLayout(null);											//设置布局管理器为null

		JLabel n = new JLabel("用户名:");									//生成 name 标签

		JLabel pw = new JLabel("密    码:");									//生成 password 标签

		JTextField name = new JTextField(30);								//生成 name 输入框

		JPasswordField password = new JPasswordField(30);					//生成 password 输入框

		JButton login = new JButton("登陆");									//生成 登陆 按钮

		JButton reset = new JButton("重置");									//生成 重置 按钮

		

		/*

		 * 设置各个模块的位置和大小

		 */

		n.setBounds(60, 50, 120, 30);

		name.setBounds(120, 50, 180, 30);

		pw.setBounds(60, 100, 120, 30);

		password.setBounds(120, 100, 180, 30);

		login.setBounds(100, 180, 70, 30);

		reset.setBounds(220, 180, 70, 30);

		

		container.add(n);

		container.add(name);

		container.add(pw);

		container.add(password);

		container.add(login);

		container.add(reset);

		

		/*

		 * 给 登陆 按钮添加 动作事件

		 */

		login.addActionListener(new ActionListener() {

			

			@Override

			public void actionPerformed(ActionEvent e) {

				if(name.getText().trim().length() == 0 || new String(password.getPassword()).trim().length() == 0) {

					JOptionPane.showMessageDialog(null, "用户名,密码不能为空");				//显示对话框

					return;

				}

				if(name.getText().equals("jtw+") && new String(password.getPassword()).equals("123456")) {

					JOptionPane.showMessageDialog(null, "登陆成功");

					return;

				} else {

					JOptionPane.showMessageDialog(null, "用户名或密码不正确");

					return;

				}

				

			}

		});

		

		/*

		 * 给 重置 按钮添加动作事件

		 */

		reset.addActionListener(new ActionListener() {

			

			@Override

			public void actionPerformed(ActionEvent arg0) {

				name.setText("");

				password.setText("");

			}

		});

		

		setVisible(true);													//使窗口显示,注:此句应放在最后,或者在main中直接调用,否则会导致某些组件不能正常加载出来.

	}

	

}
