package day1;

public class day1_7{
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		
		//ここでxとyの値を入れ替える
		int z = x;
		x = y;
		y = z;

		System.out.println("x = " + x + ", y = " + y );
	}
}