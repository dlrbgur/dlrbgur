package asd;
import java.util.Scanner;
public class _07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[5];
        int max=0;
        System.out.println("양수5개를 입력하세요.");
        for(int i=0;i<5;i++){
            Array[i]=sc.nextInt();
            if(Array[i]>max)
                max=Array[i];
        }
        System.out.println("가장 큰 수는"+max+"입니다.");
    }
}
