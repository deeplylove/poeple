package ͳ���ַ�������ĸ���ֵĸ���;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("�������ַ���");
		Scanner param1=new Scanner(System.in);
		String letter=param1.next();
		System.out.println("������Ҫ��ѯ����ĸ");
		Scanner param2=new Scanner(System.in);
		char cha=param2.next().charAt(0); 
		int count=0;
		for(int i=0;i<letter.length();i++){
		if(cha==letter.charAt(i)){
		count++;
		}
		}
		System.out.println(cha+"��ĸ���ִ�����"+count);
		}

	
}
