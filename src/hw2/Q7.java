package hw2;

//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Q7 {
	public static void main(String[] args) {
		for (char x = 'A'; x <= 'F' ; x++) {
			for (int i = 1; i <= (x - 'A' + 1); i++) {
                System.out.print(x);
            }
          
            System.out.println();
        }
	}
}