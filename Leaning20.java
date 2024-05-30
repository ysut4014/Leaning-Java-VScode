public class Leaning20 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("現在" + (i + 1) + "周目→"); //ループ変数を１からスタート
        }
        
        for (int i = 0; i < 14; i +=2 ) {
            System.out.println("計" + (i + 0) + "個");//ループ変数を２ずつ増やす
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("あと" + i + "秒");//ループ変数を１ずつ減らす
        }
        int i = 1; // 条件によりiを初期化
        // 初期化部分を省略したforループの使用
        for (; i <= 10; i++) {
            System.out.print("現在" + i + "周目→");
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.println("あと" + i + "回");
        }
    } 

    

}
