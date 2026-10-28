package ss4.bt2;
import java.util.Random;
public class RunApp {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(numbers);

        stopWatch.stop();

        System.out.println("Thoi gian thuc thi Selection Sort cho 100,000 so la: "
                + stopWatch.getElapsedTime() + " ms");
    }
}
