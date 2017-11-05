package 奇偶个数;

import java.util.Scanner;

public class 奇偶个数 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0;
		int even=0;
		int read=0;
		in = new Scanner(System.in);
		for(int i=0;;i++) {
			read=in.nextInt();
			if(read==-1) break;
			if(read%2!=0)
				odd++;
			else 
				even++;
		}
		System.out.println(odd+" "+even);
	}

}
