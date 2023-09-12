package ajaxprj0906복습;

public class Music {

	String singer;
	String title;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Music(String singer,String title) {
		super();
		this.singer = singer;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Music [singer=" + singer + ", title=" + title + "]";
	}

	
}
