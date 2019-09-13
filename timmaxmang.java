import java.util.Scanner;

public class themphantu {
    public static void main(String[] args) {
        int sizewidth;
        int sizeheigh;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" Enter a size width: ");
            sizewidth = scanner.nextInt();
            if (sizewidth > 30)
                System.out.println("Size should not exceed 30");
        } while (sizewidth > 30);
        do {
            System.out.print(" Enter a size height: ");
            sizeheigh = scanner.nextInt();
            if (sizeheigh > 30)
                System.out.println("Size should not exceed 30");
        } while (sizeheigh > 30);
        array = new int[sizewidth][sizeheigh];
        for (int i = 0; i < sizewidth; i++) {
            for (int j = 0; j < sizeheigh; j++) {
                System.out.print("Enter a mark for student [" + i + "][ " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < sizewidth; i++) {
            for (int j = 0; j < sizeheigh; j++)
                if (max < array[i][j]) {
                    max = array[i][j];
                }
        }
        System.out.print("Result:" + max);
    }
}
