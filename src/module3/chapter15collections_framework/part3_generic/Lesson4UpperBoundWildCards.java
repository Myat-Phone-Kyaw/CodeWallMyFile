package module3.chapter15collections_framework.part3_generic;

import java.util.*;

public class Lesson4UpperBoundWildCards {
    static void show(List<? extends Car> list) {
        for (Car car : list) {
            System.out.print(car);
        }
        System.out.println();
    }

    static Double add(ArrayList<? extends Number> num) {
        double sum = 0.0;

        for (Number number : num) {
            sum = sum + number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());

        List<Toyota> toyotaList = new ArrayList<>();
        toyotaList.add(new Toyota());
        toyotaList.add(new Toyota());
        toyotaList.add(new Toyota());
        toyotaList.add(new Toyota());
    }
}
