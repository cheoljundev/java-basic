package one.poly.ex.pay1;

public abstract class PayStore {
    public static Pay findPay(String option) {
        Pay pay;
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("newPay")) {
            return new NewPay();
        } else {
            return new DafaultPay();
        }
    }
}
