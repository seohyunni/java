package kr.hs.emirim.practice;

public class ClassPractice {
	public static void main(String[] args) {
		
		연예인 박나래 = new 연예인();
		박나래.실명 = "박나래";
		박나래.여자인가 = true;
		박나래.방송하기();
		박나래.인터뷰하기();
		//((영화배우)박나래).울기();
		
		
		영화배우 박서준 = new 영화배우();
		박서준.실명 = "박서준";
		박서준.여자인가=false;
		박서준.방송하기();
		박서준.인터뷰하기();
		박서준.울기();
		박서준.개인기하기();
		
		놀기();
	}
	
		private static void 놀기() {
			
			//TODO Auto-generated method stub
	}
}
