package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book dostoevsky = new Book("Idiot", 500);
        Book barto = new Book("Stihi", 200);
        Book krylov = new Book("Basni", 450);
        Book martin = new Book("Clean code", 460);
        Book[] books = new Book[4];
        books[0] = dostoevsky;
        books[1] = barto;
        books[2] = krylov;
        books[3] = martin;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Book name is " + books[index].getName()
                    + " and it contain " + books[index].getPage() + " pages");
        }
        System.out.println();
        System.out.println("0 and 3 indexes are changed");
        Book empty = books[0];
        books[0] = books[3];
        books[3] = empty;
        for (int index = 0; index < books.length; index++) {
            System.out.println("\tBook name is " + books[index].getName()
                    + " and it contain " + books[index].getPage() + " pages");
        }
        System.out.println();
        System.out.println("Selected only \"Clean code\" ");
        for (int index = 0; index < books.length; index++) {
            if ("Clean code".equals(books[index].getName())) {
                System.out.println("\tClean code is book with index " + index + " and  it contain "
                        + books[index].getPage() + " pages");
            }
        }
    }
}