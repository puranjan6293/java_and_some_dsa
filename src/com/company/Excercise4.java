//Excercise - 4;

package com.company;

class Library{
    String[] books;
    int no_of_books;
    //constructor-
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    //addBook method
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" Has been added");
    }
    //method for available books
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book: this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    //issueBook method
    void issueBook(String book){
        for (int i = 0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book is not exist");
    }
    //returning book method. same like add book
    void returnBook(String book){
        addBook(book);
    }

}

public class Excercise4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("BBD");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("java book");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("java book");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("java book");
        centralLibrary.showAvailableBooks();


    }
}
