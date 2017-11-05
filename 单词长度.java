package 单词长度;
import java.util.Scanner;
public class 单词长度 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String word = new String();
		word=in.nextLine();
		int index=0;
		//String[] words = word.split(" ");
		//String words = new String;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)!=' '&&word.charAt(i)!='.') {
				index++;
			}
			else {
				System.out.print(index);
				if(word.charAt(i)!='.'){
					System.out.print(" ");
				}
				index=0;
			}
		}
	}
}
