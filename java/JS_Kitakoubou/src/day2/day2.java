package day2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//===========================================================================
// import java.io.* と throws IOException の記述を忘れないこと
//===========================================================================

public class day2{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何か数値を入力してください。文字列に変換の上、再表示します。");
		String s = br.readLine();		//1行分の文字列を入力する
		int n = Integer.parseInt(s);	//文字列から数値を得る
		System.out.println(n);
		
	}
	
}