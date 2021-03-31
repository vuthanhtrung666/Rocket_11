package TestingSystem_Assignment_5.com.vti.entity.exer1;

import java.util.Scanner;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private Scanner sc;

	public News() {
		sc = new Scanner(System.in);
		Input();
		
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public void Input() {
		System.out.print("id:");
		id = Integer.parseInt(sc.nextLine());
		System.out.print("Title:");
		title = sc.nextLine();
		System.out.print("Publish date:");
		publishDate = sc.nextLine();
		System.out.print("Author:");
		author = sc.nextLine();
		System.out.print("Content:");
		content = sc.nextLine();
	}

	@Override
	public void display() {
		// 
		System.out.println("Id:" + id);
		System.out.println("Title:" + title);
		System.out.println("Publish date:" + publishDate);
		System.out.println("Author:" + author);
		System.out.println("Content:" + content);
		System.out.println("Average rate:" + averageRate);
	}

	@Override
	public float calculate(int[] rates) {
		// 
		int tong=0;
		for(int i=0;i<rates.length;i++) {
			tong+=rates[i];
		}
		averageRate = (float) tong/rates.length; 
		return averageRate;
	}
}
