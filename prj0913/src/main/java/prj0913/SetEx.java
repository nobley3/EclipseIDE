package prj0913;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		
//		순서없음(순서로 꺼낼 수 없다는 뜻 ex) 0번째꺼 꺼내~ 이런거 안됨
//		중복을 허용하지 않음
		HashSet<String> fruits = new HashSet<>();
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("오렌지");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
