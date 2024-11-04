package two.poly.ex.pay1;

public abstract class PayStore {
    public static Pay findPay(String option) {
        switch (option) {
            case "kakao":
                return new KakaoPay();
            case "naver":
                return new NaverPay();
            default:
                return new DefaultPay();
        }
    }
}
