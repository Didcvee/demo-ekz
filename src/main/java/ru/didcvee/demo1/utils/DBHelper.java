package ru.didcvee.demo1.utils;

import ru.didcvee.demo1.models.Product;
import ru.didcvee.demo1.models.User;

import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    static {
        users.add(new User("admin", "admin", "Администратор", "admin"));
        users.add(new User("manager", "manager", "Менеджер", "manager"));
        users.add(new User("guest", "", "Гость", "guest"));

        products.add(new Product("Товар 1", "Описание 1", "Производитель 1", 100.0, 0.1));
        products.add(new Product("Товар 2", "Описание 2", "Производитель 2", 200.0, 0.2));
    }
}
