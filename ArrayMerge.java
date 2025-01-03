public class ArrayMerge{
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        for (int num : array1) {
            mergedArray[index++] = num;
        }
        for (int num : array2) {
            mergedArray[index++] = num;
        }
        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}