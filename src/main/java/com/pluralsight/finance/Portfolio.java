package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {
    String name;
    String owner;
    List<Valuable> valuableList = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getValuableList() {
        return valuableList;
    }

    public void setValuableList(List<Valuable> valuableList) {
        this.valuableList = valuableList;
    }

    public void add(Valuable valuable) {
        this.valuableList.add(valuable);
    }
    public double getValue() {
        return 0;
    }
}
