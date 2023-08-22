package ya.lelikus81;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstTestDemo {

    @BeforeEach
    void openYandex(){
        System.out.println("Open \"yandex.ru\"");
    }

    @AfterEach
    void takeScreen(){
        System.out.println("Take Screen");
    }


    @Test
    void firstTest(){
        System.out.println("FirstTest is doing...   ");
        Assertions.assertTrue(true);
        System.out.println("FirstTest finished!   ");
    }
}
