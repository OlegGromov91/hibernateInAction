package ru.home.chapter.a.zero;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

@DisplayName("Начальная глава нужна просто для понимания, что все работает")
public class MessageTest {

    @Test
    void initTest() {
        System.out.println("chapter 2.3   | https://howtodoinjava.com/hibernate/hibernate-hello-world-application/");
    }
}
