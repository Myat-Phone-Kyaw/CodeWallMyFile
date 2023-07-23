package module1.chapter2.control_flow;

public class IfElseIfStatement {
    public static void main(String[] args) {
        String greeting = "Hi";
        if (greeting == "Hi") {
            System.out.println("What's up?. Your input is " + "'" + greeting + "'.");
        } else if (greeting == "Hello") {
            System.out.println("This is also greeting");
        } else {
            System.out.println("Yo! Your input is " + "'" + greeting + "'.");
        }
    }
}
