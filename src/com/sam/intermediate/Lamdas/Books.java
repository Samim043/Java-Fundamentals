package com.sam.intermediate.Lamdas;

import com.sam.intermediate.Lamdas.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> all(){
        List <Book> books = new ArrayList<>();
        books.add(new Book("Java", "Nabil",2006));
        books.add(new Book("Clean Code", "Shuvo",2007));
        books.add(new Book("C++", "Sourov",2008));
        books.add(new Book("DP", "Tazdid",2009));
        return books;
    }
}
