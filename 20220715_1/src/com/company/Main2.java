package com.company;

import java.util.*;

/*
Предположим, что дан список Book, но в отличие от предыдущей задачи Author – класс {String fName, String lName} и
книга более сложный объект, у которого есть список авторов, название и ISBN (International Standard Book Number)
т.е. {String title, List<Author> authors, String ISBN}. Необходимо сформировать map<Author, List<Book>>,
где ключ - автор, а значение список его книг.
Естественно, если у книги несколько авторов, то книга должна отразиться в списке книг всех авторов данной книги.


-------------------------------------------------------------------------------------------

5)      Дан map<Author, List<Book>> (например, сформированный в задаче №3).
Но в него вкрались ошибки, в список книг некоторых авторов попали книги, которые они не писали.
Необходимо:
a)      написать метод, который проверит, есть ли в map такие ошибки.
b)      написать метод, который исправит ошибки в исходном map.




 */
public class Main2 {

    public static void main(String[] args) {
        Book b1=new Book("Паттерны проектирования.",
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
        Book b5=new Book("Воина и мир",
                "55555",
                List.of(
                        new Author("Лев","Толстой")
                ));

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println(books);

        // Получаем сходный map и вносим в него "ошибки"
        Map<Author,List<Book>> map =mapBookToAuthor(books);
        map.get(new Author("Денис","Ритчи")).add(b4);
        map.get(new Author("Роберт","Мартин")).add(b5);

        System.out.println("------------Map c ошибками -----------------");
        print(map);

        System.out.println("------------ Исправленный map -----------------");
        correctAuthorsMap(map);
        print(map);

    }

    /**
     * Метод "решающий задачу" т.е. исправляющий исходный map
     * @param map
     */
    public static void correctAuthorsMap(Map<Author,List<Book>> map){
        Set<Book> errorBooks = errorBookFindAndRemove(map);
        if(errorBooks!=null&&!errorBooks.isEmpty()){
            mapBookToAuthor(new ArrayList<>(errorBooks),map);
        }
    }


    /**
     * Метод печатает переданный map
     * @param map
     */
    public static void print (Map<Author,List<Book>> map){
        for (Map.Entry e:map.entrySet() ) {
            System.out.printf("%-20s %s%n", e.getKey(),e.getValue());
        }
    }

    /**
     * Метод создает из листа книг map: Автор, Список его книг.
     * Данный метод по сути вызывает метод
     * {@code mapBookToAuthor(List<Book> list, Map<Author, List<Book>>} res)
     * и передает туда список и пустой map для заполнения.
     *
     * @param list книг
     * @return возвращает новый map
     */
    public static Map<Author, List<Book>> mapBookToAuthor(List<Book> list){
        Map<Author, List<Book>> res = new HashMap<>();
       return  mapBookToAuthor(list,res);
    }


    /**
     *  Метод добавляет в переданный  map книги из переданного списка
     * @param list список книг для добавления
     * @param res  map в который будут добавлены книги, он же является
     * @return map
     */
    private static Map<Author, List<Book>> mapBookToAuthor(List<Book> list, Map<Author, List<Book>> res){

        if(list!=null && !list.isEmpty()){
            for (Book book: list) {
                List<Author> authors=book.getAuthors();
                if(authors!=null) {
                    for (Author author : authors) {
                        List<Book> books= res.getOrDefault(author,new ArrayList<>());
                        if(!books.contains(book))books.add(book);
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


    /**
     * Метод удаляет из переданного мэпа "ошибочные" книги, т.е. книги лежащие по
     * неправильному ключу.
     *
     * @param map
     * @return сэт удаленных из исходного мэпа книг
     */

    private static Set<Book> errorBookFindAndRemove(Map<Author, List<Book>> map) {
        Set<Book> res= new HashSet<>();
        for (Map.Entry<Author, List<Book>> e:map.entrySet()) {
            List<Book> books= e.getValue();
            if (books!=null&&!books.isEmpty()) {
                Iterator<Book> iterator = books.iterator();
                while (iterator.hasNext()) {
                    Book book = iterator.next();
                    if (!book.isAuthor(e.getKey())) {
                        res.add(book);
                        iterator.remove();
                    }
                }
            }
        }
        return res;
    }

}





