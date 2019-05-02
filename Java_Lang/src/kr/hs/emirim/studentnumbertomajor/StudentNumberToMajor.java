package kr.hs.emirim.studentnumbertomajor;

import java.util.Scanner;

public class StudentNumberToMajor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("학번을 입력해주세요. >> ");
		String n=sc.nextLine();
		System.out.println(n.substring(0,1)+"학년");
		System.out.println(n.substring(1,2)+"반");
		if(n.substring(1,2).equals("1")||n.substring(1,2).equals("2")) {
			if(n.substring(0,1).equals("1")||n.substring(0,1).equals("2")) {
				System.out.println("뉴미디어소프트웨어과");
			}
			if(n.substring(0,1).equals("3")) {
				System.out.println("인터렉티브미디어과");
			}
		}
		if(n.substring(1,2).equals("3")||n.substring(1,2).equals("4")) {
			if(n.substring(0,1).equals("1")||n.substring(0,1).equals("2")) {
				System.out.println("뉴미디어웹솔루션과");
			}
			if(n.substring(0,1).equals("3")) {
				System.out.println("뉴미디어솔루션과");
			
		}
		if(n.substring(1,2).equals("5")||n.substring(1,2).equals("6")) {
			if(n.substring(0,1).equals("1")||n.substring(0,1).equals("2")) {
				System.out.println("뉴미디어디자인과");
			}
			if(n.substring(0,1).equals("3")) {
				System.out.println("뉴미디어디자인과");
		}
		
		}
		}
		String classroomStr=n.substring(1,2);
		int classroom = Integer.parseInt(classroomStr)-1;
		System.out.println(학년2[classroom])	;
	}
}
