package kr.hs.emirim.studentnumbertomajor;

import java.util.Scanner;

public class StudentNumberToMajor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�й��� �Է����ּ���. >> ");
		String n=sc.nextLine();
		System.out.println(n.substring(0,1)+"�г�");
		System.out.println(n.substring(1,2)+"��");
		if(n.substring(1,2).equals("1")||n.substring(1,2).equals("2")) {
			if(n.substring(0,1).equals("1")||n.substring(0,1).equals("2")) {
				System.out.println("���̵�����Ʈ�����");
			}
			if(n.substring(0,1).equals("3")) {
				System.out.println("���ͷ�Ƽ��̵���");
			}
		}
		if(n.substring(1,2).equals("3")||n.substring(1,2).equals("4")) {
			if(n.substring(0,1).equals("1")||n.substring(0,1).equals("2")) {
				System.out.println("���̵�����ַ�ǰ�");
			}
			if(n.substring(0,1).equals("3")) {
				System.out.println("���̵��ַ�ǰ�");
			
		}
		if(n.substring(1,2).equals("5")||n.substring(1,2).equals("6")) {
			if(n.substring(0,1).equals("1")||n.substring(0,1).equals("2")) {
				System.out.println("���̵������ΰ�");
			}
			if(n.substring(0,1).equals("3")) {
				System.out.println("���̵������ΰ�");
		}
		
		}
		}
		String classroomStr=n.substring(1,2);
		int classroom = Integer.parseInt(classroomStr)-1;
		System.out.println(�г�2[classroom])	;
	}
}
