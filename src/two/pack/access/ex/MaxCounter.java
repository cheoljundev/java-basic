package two.pack.access.ex;

public class MaxCounter {
    int count;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (!isMax()) {
            count++;
        } else {
            System.out.println("맥스 값입니다.");
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isMax() {
        return count == max;
    }
}
