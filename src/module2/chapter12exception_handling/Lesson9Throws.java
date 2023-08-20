package module2.chapter12exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Lesson9Throws {
    static void result(int a) throws FileNotFoundException,IOException {
        if(a%2==0){
            throw new IOException("Because you're gay");
        }
        System.out.println("Ok");
    }

    public static void main(String[] args) {
        try {
            result(6 );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
