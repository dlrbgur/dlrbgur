package asd;

public class _09 {enum Week{월,화,수,목,금,토,일}
    public static void main(String[] args) {
    int [] n={1,2,3,4,5};
    String names[]={"사과","배","바나나","체리","딸기","포도"};
    int sum=0;
    for(int k : n){//for each? 책보고 공부 시작
        System.out.println(k+" ");
        sum+=k;
    }
        System.out.println("합은"+sum);
    for(String s : names){
        System.out.print(s+" ");
    }
        System.out.println();
    for(Week day:Week.values()){
        System.out.print(day+"요일");

    }System.out.println();
    }
}
