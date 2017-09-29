package com.v_stepanov.some_lines_of_code.headFirsJava.chapter16_collections;

import java.util.TreeSet;

/**
 * Created by User on 28.09.2017.
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        Book b1 = new Book("How ...");
        Book b2 = new Book("Remix ...");
        Book b3 = new Book("Finding  ...");

        TreeSet<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);

    }
}

class Book implements Comparable<Book> {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book b) {
        Book book = (Book) b;
        return title.compareTo(book.title);
    }

    public String toString() {
        return title;
    }
}
