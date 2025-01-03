public class ArraySumElements {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int sum = 0;
        for (int element:array){
            sum += element;
            System.out.println(sum);
        }
    }
}
