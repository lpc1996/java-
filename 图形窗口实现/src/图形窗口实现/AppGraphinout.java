package ͼ�δ���ʵ��;

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
	JTextField in = new JTextField(10);//����һ���ı���������������
	JLabel txt = new JLabel("�����������ַ");
	JButton btn = new JButton("�ύ");//������ť
	JTextField out = new JTextField(10);//����������ʾ����ı�ǩ
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
				out.setText(s+"�������ַ");
			}
			else {
				out.setText(s+"���������ַ");
			}
		});//����������
		setSize(1000,900);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);	
	}
	
}
