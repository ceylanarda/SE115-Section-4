import java.util.Arrays;
public class sc1 {
    public static int[] resizeRoster(int[] oldRoster, int newSize) {
        int[] newRoster = new int[newSize];
        int copy = Math.min(oldRoster.length, newSize);
        for (int i = 0; i < copy; i++) {
            newRoster[i] = oldRoster[i];
        }
        return newRoster;
    }
    public static void main(String[] args){
        final int oldsize = 20;
        int [] oldRoster = new int[oldsize];
        int startid = 1000;
        for (int i=0;i<oldsize; i++){
            oldRoster[i] = startid + i;
        }
        final int newsize = 42;
        System.out.println("Old one ("+oldRoster.length + " ID's):");
        System.out.println(Arrays.toString(oldRoster));
        System.out.println("New Roster (" + newsize + " slots):");
        System.out.print("[");
        for (int i =0; i<22; i++){
        }
    }
}
