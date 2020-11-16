package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个通用的LRU缓存；
 *
 * 编写一个泛型方法，使之能处理所有Fruit子类的集合；
 *
 * 编写一个泛型方法，使之能自动将Object类型转换成其他类型；
 *
 * 编写一段程序使 将List<String>转换为List<Object>；
 */
public class Main {

    public static void main(String[] args) {
        LRUCache<Integer, Integer> cache = new LRUCache<Integer, Integer>(3);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));

        listStringToObject();

    }

    public static <T extends Fruit> void dealFruit(T t) {
        System.out.println(t);
    }

    private static <T> T autoConvert(Object o){
        return (T)o;
    }


    public static void listStringToObject() {
        List<String> list = new ArrayList<String>();
        list.add("测试bai1");
        list.add("测试2");
        list.add("测试3");
        List<Object> result = new ArrayList<Object>();
        for(int i =0;i<list.size();i++){
            result.add(list.get(i));
        }
        System.out.println(result.toString());
    }
}
