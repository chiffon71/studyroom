package day2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//===========================================================================
// import java.io.* と throws IOException の記述を忘れないこと
//===========================================================================

public class day2_1{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何か文字を入力してください。文字列を再表示します。");
		String s = br.readLine();		//1行分の文字列を入力する
		System.out.println(s);
		
	}
	
}