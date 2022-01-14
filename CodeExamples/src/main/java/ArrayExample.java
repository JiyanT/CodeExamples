import java.util.Scanner;
import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int sum = 0;

        Random rand = new Random();
        for (int i = 0; i<n; i++) {
            nums[i] = rand.nextInt(50) + 50;
            sum += nums[i];
            System.out.println(nums[i]);
        }
        double avg = (double) sum/(double)n;
        System.out.println("avg= " + avg);


    }
}
