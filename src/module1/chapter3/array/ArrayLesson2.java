package module1.chapter3.array;

public class ArrayLesson2 {
    public static void main(String[] args) {
        int a = 3;
        int numbers[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {10, 9, 8},
        };

        System.out.println(numbers[0].length);
        System.out.println(numbers[0][1]);

        System.out.println("This is number " + numbers[2][2] + ". " + "This is number " + numbers[2][0]);

        numbers[1][2] = 20;
//        System.out.print("Changed number 6 to 20: " );
        /*for (int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i] + "\t");
        }*/

//        System.out.println(Arrays.toString(numbers));
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.println(i);
            }
        }
    }
}
