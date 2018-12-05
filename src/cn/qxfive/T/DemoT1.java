package cn.qxfive.T;

import java.util.Date;

public class DemoT1 {
    public static void main(String[] args) {
        /**
         * 泛型类 泛型接口  泛型方法
         */
        t<Number> t1=new t<Number>();
        t<Float> ttt=new t<>();
        t<Integer> t2=new t<>();
        t<String> t3=new t<>();

       // t<Number> t3=new t<Integer>();
        //get(t1);
        System.out.println(t1.gettotototo("hasiiohdsfajiadsfijodasfjifdaafsdjiosdfajkio"+new Object()));
    }
    public static void get(t<? super Integer> t){
        System.out.println(t.toString());
    }
}
class t<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    void toto(){
        System.out.println("yesterday");
    }
    public   static <T>  T gettotototo(T t){
        System.out.println(new Date()+t.toString());
        return t;
    }
}