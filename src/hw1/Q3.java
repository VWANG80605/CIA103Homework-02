package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Q3 {
	public static void main(String[] args) {
		int x = 256559;
		int day = x / 86400;
		int hr = (x % 86400) / 3600;
		int min = (x % 3600) / 60;
		int sec = (x % 60);
		System.out.println(day + "天");
		System.out.println(hr + "小時");
		System.out.println(min + "分");
		System.out.println(sec + "秒");
	}

}
