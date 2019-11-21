package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Dublicate {
    public static void main(String[] args) {

       //Самый простой способ поиска и удаление дубликатов.

        Collection<String> dublicate = new ArrayList<>();
        dublicate.add("one");
        dublicate.add("two");
        dublicate.add("three");
        dublicate.add("one");
        dublicate.add("two");

        Set<String> stringSet = new HashSet<>(dublicate);
        Collection<String> withoutDublicate = new ArrayList<>(stringSet);
        System.out.println(withoutDublicate);


    }
}
