package module3.chapter15collections_framework.part3_generic;

public class Lesson2CustomGenericClass {
    public static void main(String[] args) {
        Generic hola = new Generic();
        hola.add("Myat Phone Kyaw");
        hola.add(3);
        System.out.println(hola.get());

        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.add(3);
//        integerGeneric.add("MPK");
    }
}

class Generic<T> {
    T obj;

    void add(T paramT) {
        this.obj = paramT;
    }

    T get() {
        return obj;
    }
}
