package acorn;

public class Yaksu {

	public int [] YYaksu(int n) {
		int[] arr = new int[1000];
		int index = 0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr[index]=i;
				index++;
			}
		}
		int[]answer = new int[index];
		for(int i=0;i<index;i++) {
			if(arr[i]!=0) {
				answer[i]=arr[i];
			}
		}
		return answer;
	}
}
