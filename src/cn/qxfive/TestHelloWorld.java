package cn.qxfive;

import java.util.Arrays;
import java.util.List;

public class TestHelloWorld {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("yesterayd1");
            }
        };
        Runnable runnable1=()->System.out.println("yessterday2");
        runnable.run();
        runnable1.run();

    }
}
