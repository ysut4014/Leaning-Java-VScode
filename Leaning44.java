public class Leaning44 {//引数に配列を受け取るメソッドの利用
    public static void printArray(int[] array) { //int[] array 引数に配列型を指定
        for (int element : array) {
            System.out.println(element);
        }
        
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        printArray(array); //配列を渡す
    }

}
