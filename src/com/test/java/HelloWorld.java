package com.test.java;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        int i = 1;
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        String s[] = {"a","b","c"};
        for (String s1 : s) {
            System.out.println(s1);
        }
        for (int j = 0; j < s.length; j++) {
            String s1 = s[j];
            System.out.println(s1);
        }
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("bbb");
        list.add("ccc");
        for (String s2 : list) {
            System.out.println(s2);
        }
    }
}
