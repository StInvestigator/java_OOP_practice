package oop.practice.model;

public class City {
    private String name;
    private String region;
    private String country;
    private long population;
    private String postIndex;
    private String phoneCode;

    public City(String name, String region, String country, long population, String postIndex, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postIndex = postIndex;
        this.phoneCode = phoneCode;
    }


    public void print(){
        System.out.println("\nCity name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Country: " + country);
        System.out.println("Population: " + population);
        System.out.println("Post Index: " + postIndex);
        System.out.println("Phone Code: " + phoneCode);
    }

    public void setFullLocation(String name, String region, String country) {
        this.name = name;
        this.region = region;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
