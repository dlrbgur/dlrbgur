package asd;
import java.util.Scanner;
public class _06practice {
    public static void main(String[] args) {
        int sum[] = new int[0];
        int negative=0;
        int avarage = 0;
        System.out.println("정수를 입력한 만큼 더한값과 평균값이 나오고 음수를 입력할시 프로그램이 종료됩니다");
        while(true){
            Scanner sc=new Scanner(System.in);//안되는 이유를 모르겠음
            for (int i=0;i<99;i++){
                sum[i]=sc.nextInt();
                avarage+=sum[i];
                if (sum[0]>0) {
                    System.out.println("총 입력한 값은" + sum + "입니다.");
                    negative += 1;
                    System.out.println("평균은" + avarage/negative + "입니다.");
                } else
                    break;
            }
    }}
}
