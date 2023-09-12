package page;

public class PageHandler {

//	페이지에 관련된 모든것 모아두는 곳
	
//	값을 받아오는거
	int currentPage; //현재페이지
	int totRecords;//총 레코드 수
	int pageSize; //페이지 사이즈(한 페이지에 보이는 글의 수)
	int grpSize; //그룹사이즈 
	
//	
	int totalPage; 
	int currentGrp;
	int grpStartPage;
	int grpEndPage;
	
//	값을 받아올것만!
	public PageHandler(int currentPage, int totRecords, int pageSize, int grpSize) {
		super();
		this.currentPage = currentPage;
		this.totRecords = totRecords;
		this.pageSize = pageSize;
		this.grpSize = grpSize;
		
		calcPage();
		
		
	}
	
	private void calcPage() {
		
//		1.총 페이지수
//		2.현재그룹
//		3.현재그룹의 시작페이지
//		4.현재그룹의 마지막페이지
		
//		1. 총페이지수 구하기
		int remain = totRecords%pageSize;
		if(remain==0) {
			totalPage = totRecords/pageSize;
		}else {
			totalPage = totRecords/pageSize+1;
		}
		
//		2. 현재그룹구하기
		int remain2 = currentPage % grpSize;
		if(remain2==0) {
			currentGrp = currentPage / grpSize;
		}else {
			currentGrp = currentPage / grpSize+1;
		}
		
//		현재그룹시작페이지와 마지막페이지 구하기
		grpStartPage = (currentGrp-1)*grpSize+1;
		grpEndPage = currentGrp*grpSize;
		
		if(grpEndPage>totalPage) { //마지막 페이지와 토탈페이지수가 같다
			grpEndPage=totalPage;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotRecords() {
		return totRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getGrpSize() {
		return grpSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentGrp() {
		return currentGrp;
	}

	public int getGrpStartPage() {
		return grpStartPage;
	}

	public int getGrpEndPage() {
		return grpEndPage;
	}
	
	public static void main(String[] args) {
		PageHandler h = new PageHandler(1,11,2,5);
		System.out.println(h.getTotalPage()); //9
		System.out.println(h.getCurrentGrp()); //1
		System.out.println(h.getGrpStartPage()); //1
		System.out.println(h.getGrpEndPage()); //5
		
		
		
	}
}
