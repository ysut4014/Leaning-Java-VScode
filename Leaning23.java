public class Leaning23 {
    public static void main(String[] args) {
        System.out.print("[メニュー] 1：検索 2：登録 3：削除 4：変更>"); //改行しない
        int selected = new java.util.Scanner(System.in).nextInt(); //数字を入力し変数selectedに代入
        switch (selected) {
            case 1:
              System.out.println(("検索します"));
              break;
            case 2:
              System.out.println("登録します");
              break;
            case 3:
              System.out.println("削除します");
              break;
            case 4:
              System.out.println("変更します");
              break;
        }  //変数selectedが１〜４のいずれでもない場合は何もしない
    }

}
