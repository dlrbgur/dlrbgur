package asd;
public class _12practice {
    public static int[][] Array(){
        int[][] nonsquare = new int[3][];
        nonsquare[0]= new int[3];
        nonsquare[1]= new int[3];
        nonsquare[2]= new int[4];
        nonsquare[0][0]=1;
        nonsquare[0][1]=2;
        nonsquare[0][2]=3;
        nonsquare[1][0]=4;
        nonsquare[1][1]='\n';
        nonsquare[1][2]=5;
        nonsquare[2][0]=6;
        nonsquare[2][1]=7;
        nonsquare[2][2]=8;
        nonsquare[2][3]=9;
        return nonsquare;
    }
    public static void main(String[] args) {
        int Aay[][]=Array();
        for(int i=0;i< Aay.length;i++){
            for(int j=0;j< Aay[i].length;j++){
                System.out.print(Aay[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
