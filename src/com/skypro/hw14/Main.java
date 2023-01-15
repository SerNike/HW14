package com.skypro.hw14;

public class Main {
    public static void main(String[] args) {
        Author arthurHailey = new Author("Артур", " Хейли");
        Book hotel = new Book("Отель", arthurHailey, 1965);
        System.out.println(hotel.infoBook());

        hotel.setYearBook(1965);
        System.out.println("Год издание книги: " + hotel.getYearBook());

        Author gogol = new Author("Николай", "Гоголь");
        Book nos = new Book("Нос", gogol, 1985);
        System.out.println(nos.infoBook());
    }
}
