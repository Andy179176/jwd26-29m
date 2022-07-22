package com.company;

import java.util.*;

/*
Предположим, что дан список Book, но в отличие от предыдущей задачи Author – класс {String fName, String lName} и
книга более сложный объект, у которого есть список авторов, название и ISBN (International Standard Book Number)
т.е. {String title, List<Author> authors, String ISBN}. Необходимо сформировать map<Author, List<Book>>,
где ключ - автор, а значение список его книг.
Естественно, если у книги несколько авторов, то книга должна отразиться в списке книг всех авторов данной книги.






 */
public class Main {

    public static void main(String[] args) {
        Book b1=new Book("Приёмы объектно-ориентированного проектирования. Паттерны проектирования.",
                "11111",
                List.of(
                   new Author("Эрих","Гамма"),
                   new Author("Ричард","Хелм"),
                   new Author("Ральф","Джонсон"),
                   new Author("Джон","Влиссидес")
                ));

        Book b2=new Book("Язык СИ",
                "22222",
                List.of(
                        new Author("Брайан","Керниган"),
                        new Author("Денис","Ритчи")
                ));

        Book b3=new Book("Чистый код",
                "33333",
                List.of(
                        new Author("Роберт","Мартин")
                ));

        Book b4=new Book("Чистая архитектура",
                "44444",
                List.of(
                        new Author("Роберт","Мартин")
                ));

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println(books);

        System.out.println("------------------------------------------");
        Map<Author,List<Book>> map =mapBookToAuthor(books);
        print(map);

    }

    public static void print (Map<Author,List<Book>> map){
        for (Map.Entry e:map.entrySet() ) {
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }

    public static Map<Author, List<Book>> mapBookToAuthor(List<Book> list){
        Map<Author, List<Book>> res = new HashMap<>();

        if(list!=null && !list.isEmpty()){
            for (Book book: list) {
                List<Author> authors=book.getAuthors();
                if(authors!=null) {
                    for (Author author : authors) {
                       List<Book> books= res.getOrDefault(author,new ArrayList<>());
                       books.add(book);
                       res.put(author,books);
                    }
                } else {
                    List<Book> books= res.getOrDefault(null,new ArrayList<>());
                    books.add(book);
                    res.put(null,books);
                }
            }


        }

        return  res;
    }






}
