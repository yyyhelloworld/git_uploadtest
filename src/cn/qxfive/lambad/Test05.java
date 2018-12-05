package cn.qxfive.lambad;

public class Test05 {
    public static void main(String[] args) {
        TableRequest build = new TableRequest.Builder().setDeviceId("sf").setPassword("yq").build();
        System.out.println(build.toString());
        System.out.println(23);
    }
}
