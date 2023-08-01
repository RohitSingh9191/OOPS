// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
abstract class Parent{
    public void method1(){
        System.out.println("without abstract method ");
    }
   abstract public void method2();
    abstract public void method3();
}

class Child extends Parent{

    @Override
    public void method2() {
        System.out.println(" method2 child body ");
    }
    @Override
    public void method3() {

    }
}

public class Main {
    public static void main(String[] args) {
 Child child=new Child();
 child.method1();
 child.method2();

    }
}