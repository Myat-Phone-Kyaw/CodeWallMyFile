package module3.chapter15collections_framework.part3_generic;

import java.util.List;

public class Lesson6UnboundWildCards {
    static void show6(List<?> list){
        for (Object o : list) {
            System.out.println(o+" ");
        }
        System.out.println();
    }

}
