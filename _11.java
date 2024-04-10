package asd;

public class _11 {
    public static void main(String[] args) {
         int intArray[][]=new int[4][];
         intArray[0]=new int[3];//인트어레이 1행에 3열을 추가해주는것
        intArray[1]=new int[2];//인트어레이 2행에 2열을 추가해주는것
        intArray[2]=new int[3];
        intArray[3]=new int[2];
        for(int i=0;i<intArray.length;i++)
            for(int j=0;j<intArray[i].length;j++)
                intArray[i][j]=(i+1)*10+j;
        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++)
                System.out.print(intArray[i][j]+" ");
            System.out.println();
        }

    }
}
