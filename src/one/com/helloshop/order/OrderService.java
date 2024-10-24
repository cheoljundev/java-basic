package one.com.helloshop.order;

import one.com.helloshop.product.Product;
import one.com.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
