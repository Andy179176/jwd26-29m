package com.company;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private String ISBN;

    public Book(String title, String ISBN, List<Author> authors) {
        this.title = title;
        this.authors = authors;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "("+ISBN+")" + " \"" + title + "\" " + authors ;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public boolean isAuthor(Author author) {
        return authors.contains(author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return ISBN != null ? ISBN.equals(book.ISBN) : book.ISBN == null;
    }

    @Override
    public int hashCode() {
        return ISBN != null ? ISBN.hashCode() : 0;
    }
}
