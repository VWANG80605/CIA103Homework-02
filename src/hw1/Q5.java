package hw1;

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢(用複利計算,公式請自行google)
public class Q5 {
	public static void main(String[] args) {
		double p = 1500000;
		double r = 0.02;
		int years = 10;
		System.out.println(p * (Math.pow((1 + r), years)));
	}

}
