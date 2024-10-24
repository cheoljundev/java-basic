package one.com.helloshop.order;

import one.com.helloshop.product.Product;
import one.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
