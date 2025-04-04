package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 2;
        int b = 3;

        //덧셈
        int sum = a + b;
        System.out.println("a + b=" +sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b=" +diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b=" +multi);

        //나누기
        int div = a / b;
        System.out.println("a / b=" +div);

        //나머지
        int mod = a % b;
        System.out.println("a % b=" +mod);
    }
}
