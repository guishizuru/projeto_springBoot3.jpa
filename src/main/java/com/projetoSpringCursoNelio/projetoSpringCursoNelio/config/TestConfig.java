package com.projetoSpringCursoNelio.projetoSpringCursoNelio.config;

import com.projetoSpringCursoNelio.projetoSpringCursoNelio.entities.*;
import com.projetoSpringCursoNelio.projetoSpringCursoNelio.userRepositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRespository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {


        Category cat1 = new Category(null, "Food");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");


        Product product1 = new Product(null, "the Lord of the Rings", "Lorem ipsum dolor sit ament", 100.00, "");
        Product product2 = new Product(null, "Arroz", "the sement is the color white", 33.00, "");
        Product product3 = new Product(null, "MacBook", "this is computer", 3500.00, "");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(product1, product2, product3));

        product1.getCategories().add(cat2);
        product2.getCategories().add(cat1);
        product3.getCategories().add(cat3);

        productRepository.saveAll(Arrays.asList(product1, product2, product3));

        User usuario = new User(null, "Maria", "maria@gmail.com", "99999999", "12345");
        User usuario2 = new User(null, "Alex", "alex@gmail.com", "99999997", "123456");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Order o1 = new Order(null, LocalDateTime.parse("2019-06-20T19:53:07.072", formatter), OrderStatus.PAID, usuario);
        Order o2 = new Order(null, LocalDateTime.parse("2019-07-21T03:42:10.102", formatter), OrderStatus.WAITING_PAYMENT, usuario2);
        Order o3 = new Order(null, LocalDateTime.parse("2019-07-22T15:21:22.222", formatter), OrderStatus.WAITING_PAYMENT, usuario);

        userRepository.saveAll(Arrays.asList(usuario, usuario2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));


        OrderItem orderItem1 = new OrderItem(o1,product1,2, product1.getPrice());
        OrderItem orderItem2 = new OrderItem(o1,product3,1, product2.getPrice());
        OrderItem orderItem3 = new OrderItem(o2,product3,2, product3.getPrice());
        OrderItem orderItem4 = new OrderItem(o3,product2,1, product1.getPrice());

        orderItemRepository.saveAll(Arrays.asList(orderItem1,orderItem2,orderItem3,orderItem4));

        Payment pay1 = new Payment(null, LocalDateTime.parse("2019-06-20T19:53:07.072", formatter),o1);

        o1.setPayment(pay1);
        orderRepository.save(o1);

        Payment pay2 = new Payment(null, LocalDateTime.parse("2019-06-20T19:53:07.072", formatter),o2);
        Payment pay3 = new Payment(null, LocalDateTime.parse("2019-06-20T19:53:07.072", formatter),o3);
    }
}
