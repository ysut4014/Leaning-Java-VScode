public class Leaning46 {//戻り値が配列の場合
    public static int[] makeArray(int size) {//int型配列を作成して戻すメソッド
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
        newArray[i] = i;
        
    }
       return newArray;//配列を戻す
}

    public static void main(String[] args) {
        int[] array = makeArray(3);
        for (int i : array) { //arrayの全要素を出力
            System.out.println(i);
        }
    }

}
