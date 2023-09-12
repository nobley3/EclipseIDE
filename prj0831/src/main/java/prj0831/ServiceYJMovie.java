package prj0831;

import java.util.ArrayList;

public class ServiceYJMovie {

	public ArrayList<YJMovie> getYJMovie(){
		ArrayList<YJMovie> list = new ArrayList<>();
		
		list.add(new YJMovie("달짝지근해-7510","12세","코미디","119분"));
		list.add(new YJMovie("콘크리트 유토피아","15세","드라마","130분"));
		list.add(new YJMovie("오펜하이머","15세","스릴러,드라마","180분"));
		list.add(new YJMovie("엘리멘탈","전체관람가","애니메이션","109분"));
		list.add(new YJMovie("타겟","15세","스릴러","101분"));
		
		return list;
	}
}
