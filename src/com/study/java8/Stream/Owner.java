package com.study.java8.Stream;


import java.util.List;
import java.util.Objects;

public class Owner {

    private Integer idCard;
    private String name;
    private List<House> house;

    public Owner() {
    }

    public Owner(Integer idCard, String name, List<House> house) {
        this.idCard = idCard;
        this.name = name;
        this.house = house;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getHouse() {
        return house;
    }

    public void setHouse(List<House> house) {
        this.house = house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(idCard, owner.idCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCard);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "idCard=" + idCard +
                ", name='" + name + '\'' +
                ", house=" + house +
                '}';
    }
}
