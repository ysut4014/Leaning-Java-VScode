public class Leaning39 {  //引数について(渡す値が複数の場合)
    public static void main(String[] args) {
        add(100, 20); //100と20を渡してメソッドを呼び出す
        add(200, 50); //200と50を渡してメソッドを呼び出す
    }
    //複数の値を受けるメソッド
    public static void add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "+" + "=" + ans);
    }

}
