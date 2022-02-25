package day2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//===========================================================================
// import java.io.* と throws IOException の記述を忘れないこと
//===========================================================================

public class day2_4{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("xの数値を入力してください。");
		String a = br.readLine();		//1行分の文字列を入力する
		int x = Integer.parseInt(a);	//文字列から数値を得る
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("yの数値を入力してください。");
		String b = br2.readLine();
		int y = Integer.parseInt(b);	//文字列から数値を得る
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x / y の余りは" + (x % y));
	}
	
}