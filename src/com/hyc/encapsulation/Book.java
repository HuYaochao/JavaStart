package com.hyc.encapsulation;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int price;

    public void bookInfo(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nPrice: " + price);
    }

    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = Math.max(price, 10);
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 10) {
            this.price = price;
        }else{
            System.out.println("Invalid price");
        }
    }
}
