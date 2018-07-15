package com.company;

public class Main {

    public static void main(String[] args) {

        GenIntList<Integer> genericList = new GenIntArrayList<>();

        System.out.println(genericList.size());
        System.out.println(genericList.isEmpty());

        genericList.add(10);
        genericList.add(200);
        genericList.add(3000);
        genericList.add(0);
        genericList.add(-45);
        System.out.println(genericList);

        genericList.add(1,11111);
        System.out.println(genericList);

        genericList.remove(1);
        System.out.println(genericList);

        genericList.removeElement(0);
        System.out.println(genericList);

        genericList.set(0,999);
        System.out.println(genericList);

        System.out.println(genericList.get(0));

        System.out.println(genericList.contains(473738383));
        System.out.println(genericList.contains(-45));

        System.out.println(genericList.size());
        System.out.println(genericList.isEmpty());

        genericList.clear();
        System.out.println(genericList);










    }

}