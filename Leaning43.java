public class Leaning43 {//引数の方が異なる場合
    public static int add (int x, int y) {
        return x + y;
    }
    public static int add (int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        System.out.println("10+20=" + add(10, 20));//１つ目のaddメソッドが呼びだされる
        System.out.println("10+20+30=" + add(10, 20, 30));//2つ目のaddメソッドが呼びだされる
    }


}
