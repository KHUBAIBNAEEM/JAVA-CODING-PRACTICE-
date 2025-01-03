public class ArrayAverage {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("Average: " + average);
    }
}
