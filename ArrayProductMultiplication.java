public class ArrayProductMultiplication {
    public static void main(String[] args) {
        int array[] = {1,4,5,6,7};
        int mul = 1;
        for (int i:array){
            mul *= i;
        }
        System.out.println(mul);


    }
}
