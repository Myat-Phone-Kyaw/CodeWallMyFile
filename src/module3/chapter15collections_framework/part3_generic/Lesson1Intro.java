package module3.chapter15collections_framework.part3_generic;


import java.util.ArrayList;
import java.util.List;

/**
 * Generics in Java
 * The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by detecting the bugs at compile time.
 * <p>
 * Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.
 */


public class Lesson1Intro {

    public static void main(String[] args) {

        /**
         * Syntax to use generic collection
         *
         * ClassOrInterface<Type>
         */

/**
 * (1) Type-safety: We can hold only a single type of objects in generics. It doesn't allow to store other objects.
 */
//      Without Generics, we can store any type of objects.
        List list = new ArrayList<>();
        list.add(3);
        list.add("Thura Linn");

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
//      list1.add("Thura Linn"); //compile time error
//  ===============================================================

/**
 * (2) Type casting is not required: There is no need to typecast the object.
 * Before Generics, we need to type cast.
 */
        List list2 = new ArrayList();
        list2.add("hello");
        String s = (String) list2.get(0);//typecasting

//        After Generics, we don't need to typecast the object.
        List<String> list3 = new ArrayList<String>();
        list3.add("hello");
        String s1 = list3.get(0);

//  ===============================================================

/**
 * (3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. The good programming strategy says it is far better to handle the problem at compile time than runtime.
 */


        List<String> list4 = new ArrayList<String>();
        list4.add("hello");
//        list4.add(32);//Compile Time Error


    }
}


