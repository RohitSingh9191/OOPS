// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface bike{
    int speed = 0;

    void speed();
     void color();
     void  average();

}
interface car {
    interface bus {
        void hi();
    }

    int speedd = 100;

    void speedd();

    void colorr();

    void averagee();

}
class Call implements bike,car, car.bus{

    @Override
    public void speed() {
        System.out.println(speed);
    }

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void average() {
        System.out.println(50);
    }

    @Override
    public void speedd() {

    }

    @Override
    public void colorr() {

    }

    @Override
    public void averagee() {

    }

    @Override
    public void hi() {

    }
}
    abstract  class bb extends Call {
        abstract void hello() ;
    }
    class my extends bb{

        @Override
        void hello() {

        }
        @Override
        public void speed() {
            System.out.println(speed);
        }

    }

public class Main {
    public static void main(String[] args) {
    Call call=new Call();
    call.speed();
    call.average();
    call.color();
    }
}