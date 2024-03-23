import java.util.stream.LongStream;

public class SumOfOneToNNumberJava8 {
    public static long sum(long n) {
        return LongStream.rangeClosed(1, n).sum();
    }
    public static void main(String[] args) {
     System.out.print(sum(3));
    }
}
