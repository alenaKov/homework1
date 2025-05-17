package org.example.task1;

public class Book implements Displayable {
    String author;
    int year;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void Display() {
       System.out.println(this.author+" "+this.year);
    }
}


