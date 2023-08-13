package module2.chapter12exception_handling.type_of_exceptions;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        String number = "abc";
        int num = Integer.parseInt(number);
        System.out.println(num);
    }
}
