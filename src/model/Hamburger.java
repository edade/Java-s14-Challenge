package model;

import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private Addition[] additions;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions = new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    @Override
    public void addAddition(String name, double price) {
        for(int i=0; i<additions.length; i++){
            if(additions[i] == null){
               additions[i] = new Addition(name, price);
                break;
            }
        }
    }

    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("name " + name);
        builder.append("meat " + meat);
        builder.append("breadroll type " + breadRollType);
        for (Addition addition : additions) {
            if (addition != null) {
                builder.append(addition.getName());
                builder.append(addition.getPrice());
                price = price + addition.getPrice();
            }
        }
        System.out.println(builder);
        System.out.println(price);
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return Double.compare(price, hamburger.price) == 0 && Objects.equals(name, hamburger.name) && Objects.equals(meat, hamburger.meat) && Objects.equals(breadRollType, hamburger.breadRollType) && Arrays.equals(additions, hamburger.additions);
    }


    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType='" + breadRollType + '\'' +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }
}
