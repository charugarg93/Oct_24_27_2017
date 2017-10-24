package com.intuit;

import java.util.List;

public class Company {
    private String name;
    private String location;
    private List<String> founders;
    private String hq;
    private long size;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getFounders() {
        return founders;
    }

    public String getHq() {
        return hq;
    }

    public void setHq(String hq) {
        this.hq = hq;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFounders(List<String> founders){
        this.founders = founders;
    }
    public Company(String name,String location){
        this.name = name;
        this.location = location;
        System.out.println("Company instantiated");
    }
}
