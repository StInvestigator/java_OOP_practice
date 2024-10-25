package oop.practice.model;

import java.util.Date;

public class Human {
    private String fullName;
    private Date birthday;
    private String phoneNumber;
    private String city;
    private String country;
    private String address;

    public Human(String fullName, Date birthday, String phoneNumber, String city, String country, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public Human(String fullName, Date birthday, String phoneNumber) {
        this(fullName, birthday, phoneNumber, "unknown", "unknown", "unknown");
    }

    public void print(){
        System.out.println("\nFull Name: " + fullName);
        System.out.println("Birthday: " + birthday);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);
    }

    public void setFullAddress(String city, String country, String address) {
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFullName(String name, String surname) {
        this.fullName = name + " " + surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
