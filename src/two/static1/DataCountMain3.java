package two.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        // 인스턴스를 통한 접근도 가능하다. 비권장.
        Data3 data3 = new Data3("C");
        System.out.println("C count = " + data3.count);
    }
}
