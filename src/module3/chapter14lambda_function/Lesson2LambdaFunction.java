package module3.chapter14lambda_function;

interface Changeable {
    void change(String name);
}

public class Lesson2LambdaFunction {
    public static void main(String[] args) {
        // simple way
        Changeable changeable = new Changeable() {
            @Override
            public void change(String name) {
                System.out.println("Hello");
            }
        };
        changeable.change("Myat Phone Kyaw");

        //erase
        Changeable changeable1 = (String name) -> {
            System.out.println(name);
        };

        //shortcut
        Changeable changeable2 = name -> System.out.println(name);

        //customize shortcut
        Changeable changeable3 = n -> System.out.println(n);

        // replace by IDE
        Changeable changeable4 = name -> System.out.println(name);
    }
}
