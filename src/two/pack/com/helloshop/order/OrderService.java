package two.pack.com.helloshop.order;

import two.pack.com.helloshop.product.Product;
import two.pack.com.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
