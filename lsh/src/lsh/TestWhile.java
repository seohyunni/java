package lsh;

import java.util.*;

public class TestWhile {
	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);	
			System.out.print("��� ���� �Է��ϼ���. >>");
			int member=sc.nextInt();
			if (member==5) {
			System.out.println("ITZY");
		}
		else if(member==7) {
			System.out.println("BTS");
		}
		else if(member==9) {
			System.out.println("EXO");
		}
		else if(member==1) {
			System.out.println("IU");
		}
		else if(member==13) {
			System.out.println("SEVENTEEN");
		}
		else {
			break;
		}
	
		}	System.out.println("-------------------");
	
	for(;;) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("��� ���� �Է��ϼ���. >> ");
		int member=sc.nextInt();
		if (member==5) {
		System.out.println("ITZY");
		}
		else if(member==7) {
			System.out.println("BTS");
		}
		else if(member==9) {
			System.out.println("EXO");
			}
		else if(member==1) {
			System.out.println("IU");
		}
		else if(member==13) {
			System.out.println("SEVENTEEN");
		}
		else {
			break;
		}
		}
	
	while(true) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�츮 �� ģ���� ��ȣ�� �Է��ϼ���. >> ");
		int student=sc.nextInt();
		if (student==1) {
			System.out.println("������");
		}
		else if(student==2) {
			System.out.println("������");
		}
		else if(student==3) {
			System.out.println("�谡��");
		}
		else if(student==4) {
			System.out.println("�質��");
		}
		else if(student==5) {
			System.out.println("�輱��");
		}
		else if(student==6) {
			System.out.println("�����");
		}
		else if(student==7) {
			System.out.println("������");
		}
		else if(student==8) {
			System.out.println("�ڱ���");
		}
		else if(student==9) {
			System.out.println("������");
		}
		else if(student==10) {
			System.out.println("���¿�");
		}
		else if(student==11) {
			System.out.println("������");
		}
		else if(student==12) {
			System.out.println("��ä��");
		}
		else if(student==13) {
			System.out.println("�̼���");
		}
		else if(student==14) {
			System.out.println("��ä��");
		}
		else if(student==15) {
			System.out.println("������");
		}
		else if(student==16) {
			System.out.println("������");
		}
		else if(student==17) {
			System.out.println("������");
		}
		else if(student==18) {
			System.out.println("�����");
		}
		else if(student==19) {
			System.out.println("�Ѵٿ�");
		}
		else {
			break;
		}
	
	String[] ��3= {"������","������","�谡��","�質��","�輱��","�����","������","�ڱ���","������","���¿�","������","��ä��","�̼���","��ä��","������","������","������","�����","�Ѵٿ�"};
		/*System.out.println("��ȣ�� �Է��ϼ���.");
		Scanner sc1=new Scanner(System.in);
		while(true) {int number=sc1.nextInt();
		if(1<=number && number<=18) {System.out.println(��3[number-1]);
		}
		else {
			break;
		}*/
	for(String name:��3) {
		System.out.println(name);
		}
	}

	}
}
	


		
