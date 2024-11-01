package two.pack;

import two.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        two.pack.b.User userB = new two.pack.b.User();
    }
}
