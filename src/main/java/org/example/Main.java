package org.example;

import org.example.task1.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.setAuthor("Коротквич");
        book1.setYear(1960);
        String author1= book1.getAuthor();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        book1.Display();


    }
}