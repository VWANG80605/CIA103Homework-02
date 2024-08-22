package hw1;

//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class Q2 {
	public static void main(String[] args) {
		int c = 12;
		int d = 200;
		System.out.println((d / c) + "打");
		System.out.println(200 - 12 * (d / c) + "顆");
	}
}