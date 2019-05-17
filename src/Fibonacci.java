import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        fb.fibonacci();

    }
    public void fibonacci(){
        // 0,1,1,2,3,5,8,13
        int [] fib = new int[10];
        fib[0]=0;
        fib[1]= 1;
        for (int i = 2; i < 10; i++) {
            fib[i]=fib[i-2]+fib[i-1];
        }for (int x:fib) {
            List<Integer> lista= new ArrayList<>();
           lista.add(x);
            System.out.println(x);
        }
        System.out.println(fib);
    }
}
