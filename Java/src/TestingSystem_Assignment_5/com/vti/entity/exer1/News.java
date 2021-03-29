package TestingSystem_Assignment_5.com.vti.entity.exer1;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	@Override
	public void Display() {
		// 
		System.out.println("Title:" + title);
		System.out.println("Publish date:" + publishDate);
		System.out.println("Author:" + author);
		System.out.println("Content:" + content);
		System.out.println("Average rate:" + averageRate);
	}

	@Override
	public float Calculate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
