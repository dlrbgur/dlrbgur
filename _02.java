package asd;
import java.util.Scanner;

public class _02 {//예제 3-2 혼자 바꾸기
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        System.out.println("정수를 원하는 만큼 입력하고 마지막에 0을 입력해주세요.");
        Scanner sc=new Scanner(System.in);
        int whileint =sc.nextInt();
        while(whileint != 0){
            count++;
            sum+=whileint;
            whileint =sc.nextInt();
        }
        if (whileint == 0) {
            System.out.print("평균은");
            System.out.println((double) sum / count + "입니다."+"숫자는"+count+"번 입력하였습니다.");
        }
    }}