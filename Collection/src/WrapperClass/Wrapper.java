package WrapperClass;

public class Wrapper {
    public static void main(String[] args) {
        float a = Float.parseFloat("10.2");
        System.out.println(a + 10);

        Integer b = Integer.valueOf(10);//Boxing

        System.out.println(b);
        Integer c = new Integer(15);//Boxing
        System.out.println(c);
        Integer d = 100;//autoBoxing
        int e = d.intValue();//Unboxing
        int f = d;//Unboxing//autoUnboxing
        System.out.println(e);

    }
}
