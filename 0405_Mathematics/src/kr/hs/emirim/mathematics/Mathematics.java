package kr.hs.emirim.mathematics;

import java.util.Random;

public class Mathematics {
	public static void main(String[] args) {
		System.out.println(Math.abs(25));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25.5));
		System.out.println(Math.abs(-25.5));
//abs = ���밪
		
		System.out.println("-----------------------");
		
		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));
		System.out.println(Math.round(-25.4));
		System.out.println(Math.round(-25.5));
		System.out.println(Math.round(-25.6));
		System.out.println("-----------------------");
		
		System.out.println(Math.pow(3,2));
		System.out.println(Math.pow(3.0f,2.0f));
		System.out.println(Math.pow(5.0,2));
		System.out.println(Math.pow(-5.0,3.0));
		//power���Ӹ�  3,2 -> 3�� 2����
		System.out.println("-----------------------");
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		//sq = square rt=root �簢����Ʈ
		System.out.println("-----------------------");
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)Math.random()*5); //0~4�����Ǽ�
		System.out.println((int)Math.random()*10);//0~10
		System.out.println((int)Math.random()*100);//0~100
		//0.00~9.99 / int 0~9 ������ ����
		
		System.out.println("-----------------------");
		Random random = new Random();
		int randomNumber = random.nextInt();
		int start = 100;
		int end = 999;
		int randomNumber100to99 = random.nextInt(end-start+1)+start; //start~end������ ����
		}
}
