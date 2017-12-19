package 图形窗口实现;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AppGraphinout{
	public static void main(String[] args){
		new AppJFrame();
	}
}

class AppJFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField in = new JTextField(10);//创建一个文本框用来输入数据
	JLabel txt = new JLabel("请输入邮箱地址");
	JButton btn = new JButton("提交");//创建按钮
	JTextField out = new JTextField(10);//创建用于显示结果的标签
	public AppJFrame() {
		setLayout(new FlowLayout());
		getContentPane().add(txt);
		getContentPane().add(in);	
		getContentPane().add(btn);
		getContentPane().add(out);
		btn.addActionListener(e->{
			String s= in.getText();
//			int d= Integer.parseInt(s);
			String jud="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
			if(s.matches(jud)) {
				out.setText(s+"是邮箱地址");
			}
			else {
				out.setText(s+"不是邮箱地址");
			}
		});//创建监听器
		setSize(1000,900);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);	
	}
	
}
