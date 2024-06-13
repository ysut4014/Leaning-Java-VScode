public class Leaning37 {
    public static void methodA() {
        System.out.println("methodA");
        methodB();  //methodBを呼び出す
    }
    public static void methodB() {
        System.out.println("methodB");       
    }
    public static void main(String[] args) {
        methodA();  //methodAを呼び出す
    }
}
