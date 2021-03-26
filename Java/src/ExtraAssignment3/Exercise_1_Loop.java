package ExtraAssignment3;

import java.util.Scanner;

public class Exercise_1_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		Question 1:
//		Nhập vào dãy n số thực. Tính tổng dãy, trung bình dãy, tổng các số âm,
//		dương và tổng các số ở vị trí chẵn, vị trí lẻ trong dãy.
		
		int [] b = {3,6,-7,5,-4,8,-2};
		int t = 0;
		int tbc = 0;
		int tsa = 0;
		int tsd = 0;
		int tc = 0;
		int tl = 0;
		
//		Question 2:
//		Tìm và chỉ ra vị trí xuất hiện đầu tiên của phần tử x trong dãy.
		
//		Question 3:
//		Hãy nhập vào 16 số nguyên. In ra thành 4 dòng, 4 cột.
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		for(int i=0;i<2;i++) {
			for(int j =0;j<8;j++) {
				System.out.printf("%2d  ",a[8*i+j]);
			}
			System.out.println();
		}
//		Question 4:
//		Nhập vào dãy số. In ra dãy đã được sắp xếp tăng dần, giảm dần
//		Question 5:
//		Cho một dãy các số sau: 10, 20, 90, 50, 100, 60, 30, 80, 70, 40.
//		Hãy sắp xếp các dãy này theo chiều tăng dần, giảm dần
//		Yêu cầu:
//		Thiết kế giao diện console nhập từng phần tử và hiển thị kết
//		quả ra màn hình.
//		Sau khi nhập đủ 10 phần tử theo đúng thứ tự như đề bài thì
//		thực hiện sắp xếp theo chiều tăng dần, giảm dần
	}

}
