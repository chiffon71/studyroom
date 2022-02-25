package day2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//===========================================================================
// import java.io.* と throws IOException の記述を忘れないこと
//===========================================================================

public class day2_6{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("あなたの年齢は?");
		String a = br.readLine();		//1行分の文字列を入力する
		int x = Integer.parseInt(a);	//文字列から数値を得る
		
		int year = x * 365 ;
		
		System.out.println("あなたの生れてから現在の日数は概ね " + year + "日です。" );
	}
	
}