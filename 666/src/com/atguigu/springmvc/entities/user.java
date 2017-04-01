package com.atguigu.springmvc.entities;

/**
 * Created by hp on 2017/3/25.
 */
public class user {


    private String username;
    private String password;
    private String email;
    private  int age;
    private address address;

    public com.atguigu.springmvc.entities.address getAddress() {
        return address;
    }

    public void setAddress(com.atguigu.springmvc.entities.address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {

        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user [username="+username+",password="+password
                +",email="+email+",age="+age+",address="+address
                +"]";
    }

    public user(String username, String password, String email, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }
    public user()
    {

    }

}
