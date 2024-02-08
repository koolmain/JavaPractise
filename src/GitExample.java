import java.util.Arrays;
import java.util.stream.Stream;

public class GitExample {

    public static void main(String[] args ){
        Arrays.stream(args).forEach(System.out::println);
    }
}
