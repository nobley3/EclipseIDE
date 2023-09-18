package prj0918project;

public class Flight {

	String fcod;
	String departure;
	String arrival;
	String sday;
	String eday;
	String stime;
	String etime;
	String airnum;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	 
	public Flight(String fcod, String departure, String arrival, String sday, String eday, String stime, String etime,
			String airnum) {
		super();
		this.fcod = fcod;
		this.departure = departure;
		this.arrival = arrival;
		this.sday = sday;
		this.eday = eday;
		this.stime = stime;
		this.etime = etime;
		this.airnum = airnum;
	}



	 

	public String getFcod() {
		return fcod;
	}


	public void setFcod(String fcod) {
		this.fcod = fcod;
	}


	public String getDeparture() {
		return departure;
	}


	public void setDeparture(String departure) {
		this.departure = departure;
	}


	public String getArrival() {
		return arrival;
	}


	public void setArrival(String arrival) {
		this.arrival = arrival;
	}


	public String getSday() {
		return sday;
	}


	public void setSday(String sday) {
		this.sday = sday;
	}


	public String getEday() {
		return eday;
	}


	public void setEday(String eday) {
		this.eday = eday;
	}


	public String getStime() {
		return stime;
	}


	public void setStime(String stime) {
		this.stime = stime;
	}


	public String getEtime() {
		return etime;
	}


	public void setEtime(String etime) {
		this.etime = etime;
	}


	public String getAirnum() {
		return airnum;
	}


	public void setAirnum(String airnum) {
		this.airnum = airnum;
	}


	@Override
	public String toString() {
		return "Flight [fcod=" + fcod + ", departure=" + departure + ", arrival=" + arrival + ", sday=" + sday
				+ ", eday=" + eday + ", stime=" + stime + ", etime=" + etime + ", airnum=" + airnum + "]";
	}

 
	
	
}
