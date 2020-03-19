
public class BuriBuriMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//とぐろを巻く回数
		int BuriNum;

		while(true) {
			System.out.println();

			//標準入力でとぐろの回数を初期化
			System.out.println("何ブリする？");
			BuriNum = new java.util.Scanner(System.in).nextInt();

			//ゼロ回で終了
			if(BuriNum <= 0)return;

			for(int i = 0; i <= BuriNum; i++) {
				//初期化
				String BuriStr = "";

				//右にスペースを配置
				for(int j = BuriNum; j > i; j--) {
					BuriStr += " ";
				}

				//一行目なら先っぽを表示。それ以外ならとぐろを表示
				if(i == 0) {
					BuriStr += "＾";
				} else {
					//とぐろ右側
					BuriStr += "(";

					//とぐろの真ん中
					for(int k = 0; k < i; k++) {
						BuriStr += "＝";
					}

					//とぐろの左側
					BuriStr += ")";
				}

				//表示
				System.out.println(BuriStr);
			}
		}
	}
}
