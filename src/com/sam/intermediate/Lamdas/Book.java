package com.sam.intermediate.Lamdas;

public class Book {
    private String title;
    private String author;
    private int publicationDate;

    public Book(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {

        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", publicationDate=" + publicationDate + '}';
    }
}
