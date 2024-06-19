import java.io.*;

public class _3 {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin=null;
        try{
            fin=new FileInputStream("c:\\Temp\\hangle.txt");
            in=new InputStreamReader(fin,"US-ASCII");//일부로 틀리게 해서 확인하기
            int c;
            System.out.println("인코딩 문자 집합은"+in.getEncoding());
            while((c=in.read())!=-1){
                System.out.println((char)c);
            }
            in.close();
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
