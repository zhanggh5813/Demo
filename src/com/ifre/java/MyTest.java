package com.ifre.java;


import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        // 这是单行注释
        System.out.println();
        System.out.println("你好张冠华");
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("234");
        list.add("445");
        list.add("666");
        list.add("77");
        if (list != null) {

        }
        if (list == null) {

        }


        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {
            
        }
        if (list == null) {
            
        }
        if (list != null && list.size()>0) {

        }
        for (String s : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {


        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        System.out.println();
        String zhangguanhua = method("zhang");

        System.out.println("args = [" + args + "]");
        System.out.println("MyTest.main");
        String [] arr=new String[]{"zhangsan","lisi","wangwu"};
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i <arr.length; i++) {

        }



    }

    public static String method(String name) {

        return "我在济南";
    }
}
