package org.example;


import org.example.Entity.DetectiveBook;
import org.example.Entity.FantasyBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DetectiveBook detectiveBook = applicationContext.getBean("detectiveBook", DetectiveBook.class);
        FantasyBook fantasyBook = applicationContext.getBean("fantasyBook", FantasyBook.class);

        System.out.println(detectiveBook);
        System.out.println(fantasyBook);
        applicationContext.close();
    }
}
