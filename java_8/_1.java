package java_8;

import java.io.*;

public class _1 {
    public static void main(String[] args) {
        FileReader fin=null;
        try{
            fin=new FileReader("c\\windows\\sytem.ini");
            int c;
            while((c=fin.read())!=-1){
                System.out.print((char)c);
            }
            fin.close();
        }
        catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}