package prj0907연습;

import java.util.ArrayList;

public class AcornService2 {
	
	AcornDAO2 dao = new AcornDAO2();
	
	public ArrayList<Member> getMemberList(){
		ArrayList<Member> list = dao.selectAll2();
		return list;
	}
	
	
	
	public static void main(String[] args) {
		AcornService2  s= new AcornService2();
		
		ArrayList<Member> list  =s.getMemberList();
		
		System.out.println( list);
	}
	
}
