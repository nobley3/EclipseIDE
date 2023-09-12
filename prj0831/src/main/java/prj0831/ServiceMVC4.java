package prj0831;

import java.util.ArrayList;

//영화정보를 제공하는 서비스
public class ServiceMVC4 {
	
	public ArrayList<String>getMovies(){
		ArrayList<String>list = new ArrayList<>();
		list.add("쏘우");
		list.add("엘리멘탈");
		list.add("어벤져스");
		return list;
	}
}
