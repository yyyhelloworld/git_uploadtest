package cn.qxfive.lambad;

public class TableRequest {
    private String deviceId;
    private String password;
    private Integer sing;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSing() {
        return sing;
    }

    public void setSing(Integer sing) {
        this.sing = sing;
    }
    public static class Builder{
        private TableRequest tableRequest=new TableRequest();


        public Builder setDeviceId(String deviceId) {
            tableRequest.deviceId = deviceId;
            return this;
        }

        public Builder setPassword(String password) {
            tableRequest.password = password;
            return this;
        }

        public Builder setSing(Integer sing) {
            tableRequest.sing = sing;
            return this;
        }
        public TableRequest build(){
            return tableRequest;
        }

    }

    @Override
    public String toString() {
        return "TableRequest{" +
                "deviceId='" + deviceId + '\'' +
                ", password='" + password + '\'' +
                ", sing=" + sing +
                '}';
    }
}
