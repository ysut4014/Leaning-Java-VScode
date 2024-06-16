public class Leaning45 {
    //int型配列を受け取り
    //配列内の要素全てに１を加えるメソッド
    public static int[] makeArray(int size) { //int型配列を作成して戻すメソッド
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray; //配列を戻す
    }
    public static void main(String[] args) {
        int[] array = makeArray(3);
        for (int i : array) {  //arrrayの全要素を出力
            System.out.println(i);
        }
    }

}
