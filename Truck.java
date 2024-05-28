package java_5;
interface BaeMin {//인터페이스? 잘 모르겠음
    public void deliver();
}

abstract class Vehicle {//클래스

    protected int velocity;//Vehicle 클래스에서만 사용할수있는 밸로시티를 정수형으로 사용
    protected int wheelNum;//Vehicle 클래스에서만 사용할수있는 정수형으로 만듬
    public String carName;//전역변수로 문자열을 저장해주는 carname
    public Vehicle() {//생성자
        wheelNum = 6;//실행시  wheelnum에 6과 velocity에0을 넣어준다.
        velocity = 0;
    }
    public void setCarName(String name) {//메서드
        carName = name;//setCarName(문자열)이렇게 실행 되었을경우 그 문자열을 name이라는 변수안에 저장해서 carName에 넣어준다.
    }
    public abstract void speedUp() ;//매서드임.
}//여기 까지 vehicle 클래스 내용

class Car
{
    protected int velocity;//car 클래스에서만 사용할수있는 정수형으로 만듬
    protected int wheelNum;// car 클래스에서만 사용할수있는 정수형으로 만듬
    protected String carName;// car 클래스에서만 사용할수있는 문자형으로 만듬
    public Car()//생성자
    {
        wheelNum = 4;//생성자를 생성하면 wheelNum에 4를 넣어주고 velocity에 100을 넣어준다.
        velocity = 100;
    }
    public void speedUp()//메서드
    {
        velocity++;//밸로시티안에 있는 정수의 값에 1을 추가해준다.
    }
}//여기까지 Car클래스
class Cycle implements BaeMin
{
    int velocity;//정수형 변수로 사용하기로 선언했다.
    public void deliver()//deliver매서드를 사용하면 자전거로 배달합니다.문장이 나온다.
    {
        System.out.println("자전거로 배달합니다.");
    }

    public void speedUp()//메서드 velocity의 값을 1 더해준다.
    {
        velocity++;
    }
}

public class Truck extends Car implements BaeMin{//트럭은 car을 상속 받았고 ?
    public void speedUp()//스피드없 매서드로 velocity변수안에 30을 더해준다.
    {
        velocity += 30;
    }
    public void warn()//warm메서드를 사영시 경적을 울림 이라는 문자을 출력.
    {
        System.out.println("경적을 울림");
    }

    public void deliver()//오버라이딩으로 트럭 클래스에서는 트럭으로 배달합니다. 라는 문자를 출력한다.
    {
        System.out.println("트럭으로 배달합니다.");
    }

    public static void main(String args[])
    {
        // 일반 클래스에 의한 다형성
        Truck myTruck = new Truck();//myTruck이라는 객체를 생성했다.
        myTruck.speedUp();//트럭클래스에 있는 speedup()메서드를 실행
        System.out.println("트럭의 속도 " + myTruck.velocity);//트럭의 속도는 30 으로 출력

        Car myCar = myTruck;//이게 업
        myCar.speedUp();
        System.out.println("트럭의 속도 " + myCar.velocity);

        // myCar.warn(); // 컴파일 에러
//warn()매서드는 truck에 있는 메서드라서 사용 불가능
        // 인터페이스 다형성
        BaeMin myBaeMin = new Cycle();
        myBaeMin.deliver();
        myBaeMin = myTruck;
        myBaeMin.deliver();

    }
}