package asd;

public class _04practice {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for(int b=1 ;b < 10; b++){
                System.out.print(a+"*"+b+"=");//교수님께 ''이걸로는 왜 안되는지 질문하기
                System.out.print(a * b);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
