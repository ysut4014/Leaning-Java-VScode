public class Leaning22 {
    public static void main(String[] args) {
        int isHungry = 1;//isHungryを定義し、0か1を代入
        String food = "おにぎり";//適当な食べ物を代入
        System.out.println("こんにちは");//
        if (isHungry== 0) { //isHungryが0なら「お腹いっぱいです」そうでなければ「腹ペコです」と表示
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("腹ペコです");
        }
        if (isHungry == 1) {
            System.out.println(food + "をいただきます"); //「腹ペコです」の場合は変数foodを利用して「foodをいただきます」と表示
        }
        System.out.println("ごちそうさまでした");
    }

}
