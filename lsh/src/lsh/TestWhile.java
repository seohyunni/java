package lsh;

import java.util.*;

public class TestWhile {
	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);	
			System.out.print("멤버 수를 입력하세요. >>");
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
		System.out.print("멤버 수를 입력하세요. >> ");
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
		
		System.out.print("우리 반 친구의 번호를 입력하세요. >> ");
		int student=sc.nextInt();
		if (student==1) {
			System.out.println("강지민");
		}
		else if(student==2) {
			System.out.println("강혜정");
		}
		else if(student==3) {
			System.out.println("김가영");
		}
		else if(student==4) {
			System.out.println("김나영");
		}
		else if(student==5) {
			System.out.println("김선옥");
		}
		else if(student==6) {
			System.out.println("김수진");
		}
		else if(student==7) {
			System.out.println("류정민");
		}
		else if(student==8) {
			System.out.println("박교령");
		}
		else if(student==9) {
			System.out.println("서남경");
		}
		else if(student==10) {
			System.out.println("오승연");
		}
		else if(student==11) {
			System.out.println("원예린");
		}
		else if(student==12) {
			System.out.println("원채린");
		}
		else if(student==13) {
			System.out.println("이서현");
		}
		else if(student==14) {
			System.out.println("이채린");
		}
		else if(student==15) {
			System.out.println("이현수");
		}
		else if(student==16) {
			System.out.println("임현진");
		}
		else if(student==17) {
			System.out.println("장유경");
		}
		else if(student==18) {
			System.out.println("장원이");
		}
		else if(student==19) {
			System.out.println("한다연");
		}
		else {
			break;
		}
	
	String[] 반3= {"강지민","강혜정","김가영","김나영","김선옥","김수진","류정민","박교령","서남경","오승연","원예린","원채린","이서현","이채린","이현수","임현진","장유경","장원이","한다연"};
		/*System.out.println("번호를 입력하세요.");
		Scanner sc1=new Scanner(System.in);
		while(true) {int number=sc1.nextInt();
		if(1<=number && number<=18) {System.out.println(반3[number-1]);
		}
		else {
			break;
		}*/
	for(String name:반3) {
		System.out.println(name);
		}
	}

	}
}
	


		
