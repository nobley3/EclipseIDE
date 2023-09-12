package ajaxprj0906복습;

public class Movie {

	String title;
	String age;
	String runtime;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String age, String runtime) {
		super();
		this.title = title;
		this.age = age;
		this.runtime = runtime;
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

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MovieDAO [title=" + title + ", age=" + age + ", runtime=" + runtime + "]";
	}

}
