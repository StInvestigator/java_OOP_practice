package oop.practice.model;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private String publisher;
    private String genre;
    private int pages;

    public Book(String title, String author, String publisher, String genre, int pages,int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public Book(String title, String author, String publisher, String genre, int pages) {
        this(title, author, publisher, genre, pages, 2024);
    }

    public void print(){
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + pages);
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthor(String name, String surname){
        this.author = name+" "+surname;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
