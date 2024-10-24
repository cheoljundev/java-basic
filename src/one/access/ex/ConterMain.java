package one.access.ex;

public class ConterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
