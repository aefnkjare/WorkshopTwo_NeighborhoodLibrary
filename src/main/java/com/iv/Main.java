package com.iv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Book class
        // Add properties, constructors, and setters/getters
        Scanner scanner = new Scanner(System.in);

        Book[] Book = new Book[5];

        Book[0] = new Book(7292073, "1327621898545", "Harry Potter", true, "Josh");
        Book[1] = new Book(16257002, "2983402964111", "The Holy Bible", true, "Sarah");
        Book[2] = new Book(9124276, "8725637710983", "Where the Red Fern Grows", false, "");
        Book[3] = new Book(0627703, "6172895637728", "Percy Jackson", true, "Andrew");
        Book[4] = new Book(7086845, "9287625548132", "Time Flies", false, "");

        int totalNumOfBook = Book.length;

        System.out.println()
    }
}
class Book{
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructors

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
    // Getters/Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckOut() {
        return isCheckedOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckedOut = checkOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name){
        if(!isCheckedOut){
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " has been checked out to " + checkedOutTo);
        }
    }
    public void checkIn(String name){
        if(!isCheckedOut){
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println(title + " is not checked out, it is ready to be checked out.");
        }
    }
}
