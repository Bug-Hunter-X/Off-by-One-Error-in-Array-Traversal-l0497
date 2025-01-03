public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { // <= is the bug
            arr[i] = i * 2; 
        }
        for (int value : arr) {
            System.out.println(value); 
        }
    }
}