package TestingSystem_Assignment_9.com.vti.entity.exer2;

public class NgayThangNam {
	public int ngay, thang, nam;

	public class GioPhutGiay {
		public int gio, phut, giay;

		public void xuatThongtin() {
			System.out.println("Ngay:" + ngay + "|Thang:" + thang + "|Nam:" + nam);
			System.out.println("Gio:" + gio + "|Phut:" + phut + "|Giay:" + giay);
		}
	}
}
