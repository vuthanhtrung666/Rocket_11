package TestingSystem_Assignment_5.com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_4.com.vti.entity.Exer5.CongNhan;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.KySu;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.NhanVien;
import TestingSystem_Assignment_5.com.vti.entity.exer1.News;

public class MyNews {
	List<News> news;
	Scanner sc;

	public MyNews() {
		news = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	public void insertNews() {
		//
		System.out.print("Số tin thêm:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Tin " + (i + 1) + ":");
			News a = new News();
			news.add(a);
		}

	}

	public void viewNews() {
		//
		for (News a : news) {
			a.display();
		}
	}

	public void average() {
		//
		System.out.println("Tin đánh giá:");
		int id = Integer.parseInt(sc.next());
		for (int i = 0; i < news.size(); i++) {
			if (news.get(i).getId() == id) {
				System.out.println("Số lần đánh giá:");
				int n = Integer.parseInt(sc.next());
				int[] rates = new int[n];
				for (int j = 0; j < n; j++) {
					System.out.print("Lần " + (i + 1) + ":");
					rates[j] = Integer.parseInt(sc.next());
				}
				news.get(i).calculate(rates);
				news.get(i).display();
			}
		}
	}

}
