package two.pack.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
         AccessData accessData = new AccessData();
         // public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        // 같은 패키지 default 호출 가능
        accessData.defaultField = 2;
        accessData.defaultMethod();

        // private 호출 불가
        // ide에도 뜨지 않음
        // accessData.privateField = 3;
        // accessData.privateMethod();

        // innerAccess() 호출가능
        accessData.innerAccess();
    }
}
