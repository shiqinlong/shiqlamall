package com.shiqla.mall.test;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-10
 */

@Data
class Personal {
    private String name;
    private int age;

    public Personal (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}


public class ShiqlaTest
{
    public static void main(String[] args){
        List<Personal> personalList = new LinkedList<>();
        personalList.add(new Personal("shiqinlong",22));
        personalList.add(new Personal("caiwenmin",23));
        personalList.add(new Personal("shimeng",24));
        personalList.add(new Personal("lingaili",25));
        personalList.add(new Personal("wangluoyi",26));

    }
}
