public class Leaning40 {//戻り値の例

    public static int add(int x, int y) { //戻り値の受け取り[int add]
        int ans = x + y;
        return ans;//戻り値の受け取り[int add]
    }
    public static void main(String[] args) {
        int ans = add(100, 10); //addメソッドの呼び出し(110に化ける)
        System.out.println("100 + 10 = " + ans);
    }



}
