package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){
        // 인스턴스 생성 막기
    }
    static int sum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }
    static double average(int[] array) {
        double result;
        int sum = sum(array);
        result = (double) sum / array.length;
        return result;
    }
    static int min(int[] array) {
        int result = array[0];
        for (int i : array) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }
    static int max(int[] array) {
        int result = array[0];
        for (int i : array) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
