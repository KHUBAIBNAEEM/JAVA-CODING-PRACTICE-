//Print a pyramid pattern using string literals (REVERSE)

public class starpattern {
public static void main(String[] args) {
    String star = "*";
    for(int i=5; i>=1; i--){
        System.out.println(star.repeat(i));
    }
}
    
}
