package hw1;

////請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class Q6 {
	public static void main(String[] args) {
		System.out.println(5 + 5);
		// 2個數字相加故為10
		System.out.println(5 + '5');
		// '5' 對應的unicode是16進位的35,轉換10進位是53,所以5+53=58
		System.out.println(5 + "5");
		// 字串加上數字的(串接相加)所以為55
	}
}
