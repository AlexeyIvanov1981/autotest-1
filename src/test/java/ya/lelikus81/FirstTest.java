package ya.lelikus81;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("This is the before all methods");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("This is the after all methods");
    }

    @BeforeEach
    void openYandex(){

        System.out.print("open yandex.ru");
    }

    @AfterEach
    void takeScreen(){
        //take screen
        System.out.println("take screen");

    }

    @Test
    void firsTest (){
        System.out.println("   first test");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest (){
        System.out.println("   second test");
        Assertions.assertTrue(true);
    }
}
