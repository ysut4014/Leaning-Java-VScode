public class Leaning41 {//戻り値をそのまま使う
    public static int add(int x, int y) {
        int ans = x + y;
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(add(add(10, 20),(add(30, 40))));//System.out.println((30),(70))になる
    }

}
