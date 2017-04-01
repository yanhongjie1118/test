package com.atguigu.springmvc.entities;

/**
 * Created by hp on 2017/3/25.
 */
public class address {
    private String province;
    private String city;

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {

        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
