package List;

public   class Static_class {
    public static void main(String[] args) {
    B b=new B();
    B.hi();
    Static_class.B.hi();
    }
    static {
        System.out.println("hello");
    }

    public static class B{
        int a=1;
        B(){
            System.out.println("Call Static class");
        }
        public static void hi(){
            System.out.println("hi");
        }
    }
}

