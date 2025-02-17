import java.util.Arrays;

public class Missingrange {
    public static void printMissingRanges(int[] arr, int startRange, int endRange) {
        Arrays.sort(arr);
        int current = startRange;
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < current) continue;
            if (arr[i] > current) {
                System.out.println("[" + current + " " + (arr[i] - 1) + "]");
            }
            current = arr[i] + 1;
        }
        if (current <= endRange) {
            System.out.println("[" + current + " " + endRange + "]");
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 16, 23, 24, 24, 51, 52};
        int startRange = 5;
        int endRange = 55;
       
        printMissingRanges(arr, startRange, endRange);
    }
}

