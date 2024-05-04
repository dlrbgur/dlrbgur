package java_5;
class Point{
    private int x,y;
    public void set(int x,int y){
        this.x=x;this.y=y;
    }
    public void showPoint(String red){
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint extends Point{
private String color;
public void setColor(String color) {
    this.color = color;
}
public void showColorPoint(){
    System.out.print(color);
    showPoint("red");
}
public class _2024_05_04_01 {
    public static void main(String[] args) {
        Point p=new Point();
        p.set(1,2);
        p.showPoint("red");
        ColorPoint cp=new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
        }
    }
}
