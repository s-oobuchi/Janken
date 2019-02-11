package janken;

import java.util.InputMismatchException;
import java.util.Scanner;

//じゃんけんプログラム
public class janken {

	/*
	 * ＜概要＞ じゃんけんを行い、勝敗結果を表示する
	 * ＜詳細＞ ①キーボードからお互いの出す手を入力する
	 *			　※１：グー、２：チョキ、３：パー
	 *			②勝敗結果を表示する
	 * ＜備考＞
	 */
	public static void main(String[] args) {

		//変数初期化
		int x = 0;
		int y = 0;

		Scanner sc = new Scanner(System.in);

		//改行コード取得処理
		String Separator = getLineCd();

		//入力受付開始
		System.out.println("１：グー" + Separator + "２：チョキ" + Separator + "３：パー");

		//Ａ入力
		System.out.println("Ａの番です");

		//型が不一致の場合はメッセージを出力させ処理を終了する
		try {

			x = sc.nextInt();

		}catch(InputMismatchException e){

			System.out.println("Ａが数値以外を入力したので終了します");
			System.out.println(e);
			System.exit(0);
		}

		//１、２、３以外の数値が入力された場合
		if(x != 1 && x != 2 && x != 3) {
			System.out.println("Ａが１、２、３以外の数値を入力したので終了します");
			System.exit(0);
		}

		//Ｂ入力
		System.out.println("Ｂの番です");

		//型が不一致の場合はメッセージを出力させ処理を終了する
		try {

			y = sc.nextInt();

		}catch(InputMismatchException e){

			System.out.println("Ｂが数値以外を入力したので終了します");
			System.out.println(e);
			System.exit(0);
		}
		//１、２、３以外の数値が入力された場合
		if(y != 1 && y != 2 && y != 3) {
			System.out.println("Ｂが１、２、３以外の数値を入力したので終了します");
			System.exit(0);
		}

		//リソース解放
		sc.close();

		//勝敗結果表示処理
		result(x,y);
	}

	/*
	 * ＜概要＞ 改行コードを取得する
	 * ＜詳細＞ ①変数「lineCd」に改行コードを格納し、戻り値とする
	 * ＜備考＞
	 */
	public static String getLineCd() {

		//改行コード取得
		String lineCd = System.lineSeparator();
		return lineCd;

	}

	/*
	 * ＜概要＞ 勝敗結果を表示する
	 * ＜詳細＞ ①グーの場合
	 * 			②チョキの場合
	 * 			③パーの場合
	 * ＜備考＞
	 */
	public static void result(int value1,int value2) {

		//勝敗結果表示
		switch (value1) {

		//Ａがグーの場合の勝敗結果表示
		case 1:
			if(value2 == 1) {
				System.out.println("あいこです");
			}
			else if(value2 == 2){
				System.out.println("Ａの勝ちです");
			}
			else{
				System.out.println("Ｂの勝ちです");
			}
			break;

		//Ａがチョキの場合の勝敗結果表示
		case 2:
			if(value2 == 1) {
				System.out.println("Ｂの勝ちです");
			}
			else if(value2 == 2){
				System.out.println("あいこです");
			}
			else{
				System.out.println("Ａの勝ちです");
			}
			break;

		//Ａがパーの場合の勝敗結果表示
		case 3:
			if(value2 == 1) {
				System.out.println("Ａの勝ちです");
			}
			else if(value2 == 2){
				System.out.println("Ｂの勝ちです");
			}
			else{
				System.out.println("あいこです");
			}
			break;
		}

	}

}
