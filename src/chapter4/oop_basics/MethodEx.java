package chapter4.oop_basics;

public class MethodEx {
    void sum() {
        System.out.println(6);
    }

    public static void multiply(){
        System.out.println("6 x 6 is 36");
    }

    public static void main(String[] args) {
        MethodEx a = new MethodEx();
        a.sum();

        multiply();
        System.out.println(new MethodEx());
        System.out.println(new MethodEx());
    }
}
