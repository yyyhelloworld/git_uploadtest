package cn.qxfive.lambad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambad01 {
    //利用每个值依次比较
public static int getMax(int []x){
    int max=x[0],t=0;

    for (int i = 1; i <x.length; i++) {
        if(x[i]>max){
           max=x[i];
        }
    }
    return max;
}
   //利用先从小到大排序，取数组最后的值
    public static int getMax1(int []x){
       Arrays.sort(x);
       return x[x.length-1];
    }
    //利用jdk8 lambda的接口stream获取最大值
    public static int getMax2(int []x){
    List<Integer> list=new ArrayList<>();
        for (int i = 0; i <x.length-1 ; i++) {
            list.add(x[i]);
        }
     return    list.stream().mapToInt((number)->number).summaryStatistics().getMax();

    }


    public static void main(String[] args) {
        int []x=new int[]{1,2,43,-23,-2,3,22};
        System.out.println(getMax2(x));
        //lambda  list循环
        /*List<String> list1= Arrays.asList("a","b","c","d","e");
        for(String s:list1){
            System.out.println(s);
        }
        int []x=new int[]{1,2,43,-23,-2,3,22};
        System.out.println(getMax1(x));

        System.out.println("----------------");
        list1.forEach((s)-> System.out.println(s));*/
      // Arrays.sort(list1,(String x1,String x2)->( x1.compareTo(x2)));
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
        /*for (int i = players.length - 1; i >= 0; i--) {
            System.out.println(players[i]);
        }*/
        System.out.println("abcde".charAt("abced".length()-1));


/*
        System.out.println("-----------");
        list1.forEach(System.out::println);*/


    }
}
