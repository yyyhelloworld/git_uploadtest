package cn.qxfive.lambad;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<String>(){
            {
                add("sdf");
                add("kaf");
            }
        };
        boolean found = false;
        for(String city : cities) {
            if(city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found chicago?:" + found);
        System.out.println(cities.contains("Chicago"));
        cities.stream().filter((x)->x.equals("Chicago")).forEach(System.out::println);
        System.out.println("-------------------");
        final List<Integer> prices = Arrays.asList(
               10,200,29,100,23,1,300,9);
        prices.stream().filter((p)->p>30).map((p)->p*0.9).forEach(System.out::println);
    }
}
