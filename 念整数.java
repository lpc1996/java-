package ������;
import java.util.Scanner;
public class ������ {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		System.out.println("������һ��������Χ��[-100000,100000]");
		int num=in.nextInt();
		System.out.print(num+"��ƴ���ǣ�  ");
		if(num<0) {
			System.out.print("fu ");
			num=-num;
		}
		int index=0;
		String[] str= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		int[] place = new int[6];
		for(int i=0;;i++,index++) {
			place[i]=num%10;
			num=num/10;
			if(num==0) break;
		}
		for(int i=index; i>=0;i--) {
			System.out.print(str[place[i]]);
			if(i>0) 
				System.out.print(" ");
		}
	}

}
