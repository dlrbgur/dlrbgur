package asd;
import java.util.Scanner;
public class _08 {
    public static void main(String[] args) {
        int Array[]=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print(Array.length+"개의 정수를 입력하세요>>");
        for(int i=0;i<Array.length;i++){
            Array[i]=sc.nextInt();

        }
        for(int i=0;i<Array.length;i++){
            sum+=Array[i];
        }
        System.out.print("평균은"+(double)sum/Array.length);
    }
}
