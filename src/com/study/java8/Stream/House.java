package com.study.java8.Stream;


import java.util.Objects;

public class House {
    private String area;
    private String price;
    private String address;

    public House() {
    }

    public House(String area, String price, String address) {
        this.area = area;
        this.price = price;
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(area, house.area) && Objects.equals(price, house.price) && Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, price, address);
    }

    @Override
    public String toString() {
        return "House{" +
                "area='" + area + '\'' +
                ", price='" + price + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}