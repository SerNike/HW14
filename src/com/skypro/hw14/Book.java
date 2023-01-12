package com.skypro.hw14;

public class Book {
    public String nameBook;
    private final Author author;
    public int yearBook;

    public Book (String nameBook, Author author, int yearBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearBook = yearBook;
    }


    public String getNameBook() {
        return nameBook;
    }
    public int getYearBook(){
        return yearBook;
    }
    public Author getAuthor(){
        return author;
    }
    public void setYearBook(int yearBook) {
        System.out.println("год издание книги: " + yearBook);
    return;
    }
    public String infoBook(){
        return "Название книги: " + nameBook + ". Автор книги: " + author.fullNameAuthor() + ". Год издания: " + yearBook;
    }
}
