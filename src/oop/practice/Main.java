package oop.practice;

import oop.practice.model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Artur Morgan",new Date(85, Calendar.JANUARY,1),"+380508896460","Los-Angeles","USA","Wild");
        human.print();
        human.setFullName("New Name");
        human.print();

        City city = new City("Odessa","Odesska Oblast","Ukraine",100000,"0232","04");
        city.print();

        String[] cities = {"Odessa","Lviv","Kyiv","Kramatorsk"};
        Country country = new Country("Ukraine","Europe",39000000,"+38","Kyiv",cities);
        country.print();

        Fraction fraction = new Fraction(1,2);
        fraction.print();
        fraction.plus(1,2);
        fraction.print();
        fraction.multiply(3);
        fraction.print();
        fraction.minus(1);
        fraction.print();

        Book book = new Book("Book title", "Author", "Publisher", "Horror", 200);
        book.print();

        Car car = new Car("Model-X","Tesla",2021,40);
        car.print();
    }
}