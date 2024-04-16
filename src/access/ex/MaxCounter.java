package access.ex;

public class MaxCounter {
    private int count;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    void increment(){
        if (valiCount(count + 1)){
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    private boolean valiCount(int count){
        return count <= max;
    }

    int getCount(){
        return count;
    }
}
