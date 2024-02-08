import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void method(){
        String local= "thisLocal";
    }

//    public static stateChange(){
//        int total = 5;
//        Runnable r = () -> total++;
//    }


    public static void main(String[] args) {
//        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//        }

     //   Predicate c = c1 -> c1.equals("d");
        //LocalDate dt = LocalDate.now().withYear(2025);
//        OffsetTime cur = OffsetTime.now();
//    Instant no = Instant.now();
       // Duration dur = Duration.ofSeconds(60).plusHours(25);
       /// System.out.println("Current instant "+ dur  + " in days is "+dur.toDays() + " temoral sec " + dur.get(ChronoUnit.SECONDS)) ;

       // System.out.println("After ading days "+ dt.plusDays(5) );

        List<String> lst = Arrays.asList("a","s","sss","www","a");
         System.out.println(lst.stream().collect(Collectors.toMap(Function.identity(),String::length,(item, identicalItem) -> 66)));
        //System.out.println(lst.stream().collect(Collectors.counting()));

//        AtomicInteger integer = new AtomicInteger(9);
//
//        ForkJoinPool pool = ForkJoinPool.commonPool();
//        List<Callable<Integer>> tasks = new ArrayList<>();
//        tasks.add(createTask());
//        tasks.add(createTask());
//        tasks.add(createTask());
//        tasks.add(createTask());
//        pool.invokeAll(tasks);
//    }
//
//    private static Callable<Integer> createTask() {
//        return () -> {
//            try {
//                Thread.sleep(2000);
//                System.out.println(Thread.currentThread().getName());
//                return 8;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };

        LocalDate today = LocalDate.now();
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);

        System.out.println(today);
        System.out.println(payday);
        Set<Integer> st = Set.of(1,5,7,8,4) ;
        st.add(2);
    }

}