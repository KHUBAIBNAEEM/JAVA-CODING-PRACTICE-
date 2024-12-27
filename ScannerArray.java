import java.util.Scanner;

public class ScannerArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of your numbers: ");
    int size = sc.nextInt();

    int[] array = new int[size];

    for(int i=0; i<size; i++){
        System.out.println("Enter " + size + " Integer");
        array [i] = sc.nextInt();

    }
    System.out.println("Array Elements: ");
    for(int n:array){
        System.out.println(n + " ");
    }

    sc.close();   
}
}