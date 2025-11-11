import java.util.Arrays;
import java.util.Random;
public class scn2 {
    public static int[] rotateArrayRight(int[] array){
        if (array == null || array.length <=1){
            return array;
        }
        int n = array.length;
        int last = array[n-1];
        for (int i = n-2; i>=0;i--){
            array[i+1] = array[i];
        }
        array[0] = last;
        return array;
    }
    public static void main(String[] args){
        Random random = new Random();
        int arraySize = 10 + random.nextInt(11);
        int[] original = new int[arraySize];
        for (int i = 0; i<arraySize; i++){
            original[i]= random.nextInt(100);
        }
        int[] rotatedArray = rotateArrayRight(original);
        System.out.println(Arrays.toString(rotatedArray));
    }
}
