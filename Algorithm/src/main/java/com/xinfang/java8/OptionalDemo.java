package com.xinfang.java8;

import java.util.*;

/**
 * java8判空
 *
 * @author TangWenBo
 * @date 2019/10/29
 */
public class OptionalDemo {

    static List<String> list = new ArrayList<>();

    static {
        list.add("777");
        list.add("888");
        list.add("999");
    }

    public static void main(String[] args) {
        Map map = new HashMap(2);
        map.put("1", 555);
        map.put("2", "dsadsa");
        map.put("3", 3);

        int  a  =(int) Optional.ofNullable(map.get("3")).orElse(2);
        System.out.println(a);


    }


}
