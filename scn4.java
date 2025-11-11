import java.util.Random;
public class scn4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 101);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int peakCount = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakCount++;
            }
        }
        System.out.println("Count of peaks: " + peakCount);

        if (peakCount == 0) {
            System.out.println("No peaks detected.");
            return;
        }

        int[] peakIndexes = new int[peakCount];
        int currentPeakIndex = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakIndexes[currentPeakIndex] = i;
                currentPeakIndex++;
            }
        }
        System.out.println("Indices: ");
        for (int i = 0; i < peakIndexes.length; i++) {
            System.out.println("The peak with the value " + arr[peakIndexes[i]] + " has the index of " + peakIndexes[i]);
        }
        int tallestPeak = arr[peakIndexes[0]];
        for (int i = 0; i < peakIndexes.length; i++) {
            if (arr[peakIndexes[i]] > tallestPeak) {
                tallestPeak = arr[peakIndexes[i]];
            }
        }
        System.out.println("Tallest peak has the height of: " + tallestPeak);
    }
}