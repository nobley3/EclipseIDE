package prj0831;

public class YJMovie {

	String title;
	String age;
	String genre;
	String runningtime;
	 
	public YJMovie() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(String runningtime) {
		this.runningtime = runningtime;
	}

	@Override
	public String toString() {
		return "YJMovie [title=" + title + ", age=" + age + ", genre=" + genre + ", runningtime=" + runningtime + "]";
	}

	public YJMovie(String title, String age, String genre, String runningtime) {
		super();
		this.title = title;
		this.age = age;
		this.genre = genre;
		this.runningtime = runningtime;
	}
	
	
}
