package lsh;

public class TestIf {
	public static void main(String[] args) {
		int member=5;
		//if문으로 member가 5이면 ITZY 출력
		//7이면 BTS, 9면 EXO, 1이면 IU, 13이면 SEVENTEEN
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
		System.out.println("-------------------");
		
		switch(member) {
		case 5: 
			System.out.println("ITZY");
			break;
		case 7:
			System.out.println("BTS");
			break;
		case 9:
			System.out.println("EXO");
			break;
		case 1:
			System.out.println("IU");
			break;
		case 13:
			System.out.println("SEVENTEEN");
			break;
		}
		System.out.println("-------------------");
		for(int i=1; i<=9; i++) {
			int x=(2*i);
			System.out.println("2x"+i+" = "+x);
		}
		
		System.out.println("================");
		
		int j=1;
		while(j<=9) {
			int x2=(2*j);
			System.out.println("2x"+j+" = "+x2);
			j++; 
			
		}
	}
}
