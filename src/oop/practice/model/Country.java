package oop.practice.model;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private long population;
    private String phoneCode;
    private String capital;
    private String[] cities;

    public Country(String name, String continent, long population, String phoneCode, String capital, String[] cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void print(){
        System.out.println("\nCountry name: " + name);
        System.out.println("Continent: " + continent);
        System.out.println("Population: " + population);
        System.out.println("Phone code: " + phoneCode);
        System.out.println("Capital: " + capital);
        System.out.println("Cities: " + Arrays.toString(cities));
    }

    public void setCityName(String oldName, String newName){
        for (int i = 0; i < cities.length; i++){
            if (cities[i].equals(oldName)){
                cities[i] = newName;
                return;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
