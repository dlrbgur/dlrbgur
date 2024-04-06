package asd;

public class _03 {//예제 3번 그대로 코딩해보기
    public static void main(String[] args) {
        char c='a';

        do{
            System.out.print(c);
            c = (char) (c+1);
        }while(c<='z');
    }
}
