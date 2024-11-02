package two.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 decoUtil = new DecoUtil1();
        String deco = decoUtil.deco(s);

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }
}
