package prj;

import java.util.ArrayList;

public class MyUtils {

	public String getDivisor(int su) {
		
		int su_half = su/2;
		
		System.out.println( su);
		System.out.println( su_half);		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for( int i=1 ; i<=su_half ; i++) {
			 if( su % i  ==0) {
				 nums.add(i);
			 }
		}		
		nums.add(su);		//자기자신 넣은것
		
		String divisors = nums.toString();
		return divisors;
	}
	public static void main(String[] args) {
		MyUtils a = new MyUtils();
		String result = a.getDivisor(12);
		System.out.println(result);
	}
}
