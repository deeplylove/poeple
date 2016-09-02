package 统计字符串中字母出现的个数;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("请输入字符串");
		Scanner param1=new Scanner(System.in);
		String letter=param1.next();
		System.out.println("请输入要查询的字母");
		Scanner param2=new Scanner(System.in);
		char cha=param2.next().charAt(0); 
		int count=0;
		for(int i=0;i<letter.length();i++){
		if(cha==letter.charAt(i)){
		count++;
		}
		}
		System.out.println(cha+"字母出现次数："+count);
		}

	
}
