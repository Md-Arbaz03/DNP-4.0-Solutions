package com.arbaz.project;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService obj = (BookService) context.getBean("bookService");
        BookRepository obj1 =(BookRepository) context.getBean("bookRepository");

        obj.listBooks();
    }
}