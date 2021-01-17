package com.company;

public class Giga {
    private double giga, mega;
    public Giga(){}
    public Giga(double giga, double mega){
        this.giga = giga;
        this.mega = mega;
    }

    public double getGiga() {
        return giga;
    }

    public void setGiga(double giga) {
        this.giga = giga;
    }

    public double getMega() {
        return giga*1000;
    }
}