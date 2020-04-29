package com.chx.java;

import java.util.ArrayList;

/**
 * @author Honson Chan
 * @date 2020/4/15 - 23:41
 */
public class TemplatesTest {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        String[] arr = new String[]{"tt", "rr"};
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(123);
        list.add(154);
        for (Object o : list) {
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
        }
    }

    public void method() {
        //if
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(123);
        //ifn
        if (list == null) {
        }
        //变形：inn
        if (list != null) {
        }
        //变形：xxx.nn / xxx.null  }
        if (list == null) {
        }
        if (list != null) {
        }
    }
}
