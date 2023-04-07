package com.study.java8.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<Owner> ownerList = getOwnerList();
/*        ownerList.stream()
                .distinct()
                .forEach(owner -> System.out.println(owner));*/
/*        ownerList.stream()
                .map(owner -> owner.getName())
                .forEach(name -> System.out.println(name));*/
      /*  ownerList.stream()
                .filter(owner -> owner.getIdCard() > 2000)
                .distinct()
                .forEach(owner -> System.out.println(owner.getIdCard()));*/
/*        long count = ownerList.stream()
                .distinct()
                .count();
        System.out.println(count);
    }*/
/*        ownerList.stream()
                .distinct()
                .sorted(((o1, o2) -> o2.getIdCard() - o1.getIdCard()))
                .forEach(owner -> System.out.println(owner.getIdCard()));*/
/*        ownerList.stream()
                .flatMap(owner -> owner.getHouse().stream())
                .distinct()
                .forEach(house -> System.out.println(house));*/
/*        ownerList.stream()
                .flatMap(owner -> owner.getHouse().stream())
                .distinct()
                .flatMap(house -> Arrays.stream(house.getAddress().split("#")))
                .distinct()
                .forEach(s -> System.out.println(s));*/
/*        Integer reduce = ownerList.parallelStream()
                .flatMap(owner -> owner.getHouse().stream())
                .peek(house -> System.out.println(house.getArea() + Thread.currentThread()))
                .map(house -> Integer.valueOf(house.getArea()))
                .reduce(0, (r, e) -> r + e);
        System.out.println(reduce);*/
/*        Set<String> collect = ownerList.stream()
                .flatMap(owner -> owner.getHouse().stream())
                .map(house -> house.getAddress())
                .collect(Collectors.toSet());
        System.out.println(collect);*/
        /*Map<Integer, List<House>> collect = ownerList.stream()
                .distinct()
                .collect(Collectors.toMap(owner -> owner.getIdCard(), owner -> owner.getHouse()));
        Set<Map.Entry<Integer, List<House>>> set = collect.entrySet();
        for(Map.Entry<Integer, List<House>> owner : set) {
            System.out.println(owner.getKey() +":"+ owner.getValue());
        }*/
        ownerList.parallelStream()
                .distinct()
                .flatMap(owner -> owner.getHouse().stream())
                .map(house -> Integer.valueOf(house.getArea()))
                .forEach(integer -> System.out.println(integer));
    }

    public static List<Owner> getOwnerList() {

        House h1 = new House("240", "1000w","北京#建业");
        House h2 = new House("220","100w","上海#金沙");
        House h3 = new House("120","200w","上海#中海");
        House h4 = new House("210","4000w","杭州#万科");
        House h5 = new House("300","3000w","海南#建业");
        House h6 = new House("190","5000w","北京#中海");
        House h7 = new House("190","5000w","上海#金沙");

        ArrayList<House> house1 = new ArrayList<>();
        ArrayList<House> house2 = new ArrayList<>();
        ArrayList<House> house3 = new ArrayList<>();
        ArrayList<House> house4 = new ArrayList<>();

        house1.add(h1);
        house1.add(h2);
        house1.add(h3);
        house2.add(h6);
        house3.add(h1);
        house3.add(h2);
        house4.add(h7);
        house4.add(h4);
        house4.add(h5);


        Owner o1 = new Owner(2000,"Tom",house1);
        Owner o2 = new Owner(2200,"jack",house2);
        Owner o3 = new Owner(2000,"Tom",house3);
        Owner o4 = new Owner(1020,"anna",house4);

        ArrayList<Owner> ownerList = new ArrayList<>();

        ownerList.add(o1);
        ownerList.add(o2);
        ownerList.add(o3);
        ownerList.add(o4);

        return ownerList;
    }
}
