public class Leaninig32 {
    public static void main(String[] args) {
        //配列について
        int[] arrayA = {1, 2, 3};
        int[] arrayB;
        arrayB = arrayA;
        arrayB[0] = 100;
        System.out.println(arrayA[0]);
        // arrayAに１、arrasyBに１００を代入しarrayA[0]を表示すると１００が表示される
    }

}
