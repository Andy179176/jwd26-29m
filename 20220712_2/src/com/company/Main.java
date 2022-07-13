package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Дан список Book{String author, String title}.
Необходимо сформировать map<String, List<String>> , где ключом будет автор, а
значением - список книг данного автора.

 */
public class Main {

    public static void main(String[] args) {
        List<Book> list =List.of(
           new Book("Пушкин","Капитанская дочка"),
           new Book("Булгаков","Мастер и Маргарита"),
           new Book("Булгаков","Собачье ссердце"),
           new Book("Пушкин","Евгений Онегин"),
           new Book("Толстой","Война и мир")
        );
        Map<String, List<String>> map = mappingTitleToAuthor(list);
        System.out.println(map);

        map.get("Пушкин").add("Дубровский");

        System.out.println(map);

    }

  public static Map<String, List<String>> mappingTitleToAuthor(List<Book> list){
      Map<String, List<String>> result = new HashMap<>();
      if(list!=null&&!list.isEmpty()){
          for (Book book:list) {
              List<String> value=result.get(book.getAuthor()); // list книг автор или null
              if (value==null){
                  value=new ArrayList<String>();
                  result.put(book.getAuthor(),value);
              }
              value.add(book.getTitle());
          }
      }
      return result;
  }

}

class Book{
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + " - " +title;
    }
}


