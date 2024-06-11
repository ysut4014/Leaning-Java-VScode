public class Leaning35 {

    public static void main(String[] args) {
        {
       //int型の値を４個まとめて格納できる配列 points 
       int[] points = new int[4];
       //double型の値を５個まとめて格納できる配列 weights
       double[] weights = new double[5];
       //boolean型の値を３個まとめて格納できる配列 answers
       boolean[] answers = new boolean[3];
       //String型の値絵を３個まとめて格納できる配列 names
       String[] names = new String[3];
        }
        {
       //３つの口座残高「121902」「8302」「55100」が格納されているint型配列moneyList
       //その配列の要素を１つずつfor文で取り出して表示
       int[] moneyList = {121902, 8302, 55100};
       for (int i = 0; i < moneyList.length; i++) {
        System.out.println(moneyList[i]);
       }
       //同じ配列の要素を拡張for文で１つずつ取り出して表示
       for (int m : moneyList) {
        System.out.println(m);
       }
        }
        {
       //int型で要素数３の配列numbers[3][4][9]を準備
       int[] numbers = {3, 4, 9};

       //1桁の数字を入力してください」とメッセージを表示
       System.out.println("1桁の数字を入力してください");

       //数字の入力を受け付け、変数inputに代入
       int input = new java.util.Scanner(System.in).nextInt();

       //配列をループで回しながら判定、ひとしければ「アタリ！」と表示
       for (int n : numbers) {
        if (n == input) {
            System.out.println("アタリ！");
        }
       }
        }
    }
}
