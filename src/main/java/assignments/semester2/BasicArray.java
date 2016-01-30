package assignments.semester2;

public class BasicArray {
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;

    public static void main(String[] args) {
        int[] list = new int[LIMIT];
        for (int index = 0; index < LIMIT; index++) {
            list[index] = index * MULTIPLE;
        }
        list[5] = 99;
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(list[index] + " ");
        }
        System.out.println();
    }
}
