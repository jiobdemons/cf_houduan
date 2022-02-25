package com.cf_houduan.cf_houduan.entity;

public class AccountEntity {

    private Integer id ;

    private String username ;

    private String password ;

    private String user_ex1 ;

    private String user_ex2 ;

    private String user_ex3 ;

    private String user_ex4 ;

    private String user_ex5 ;

    private String user_dat1 ;

    public AccountEntity(Integer id, String username, String password, String user_ex1, String user_ex2, String user_ex3, String user_ex4, String user_ex5, String user_dat1) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.user_ex1 = user_ex1;
        this.user_ex2 = user_ex2;
        this.user_ex3 = user_ex3;
        this.user_ex4 = user_ex4;
        this.user_ex5 = user_ex5;
        this.user_dat1 = user_dat1;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUser_ex1() {
        return user_ex1;
    }

    public void setUser_ex1(String user_ex1) {
        this.user_ex1 = user_ex1;
    }

    public String getUser_ex2() {
        return user_ex2;
    }

    public void setUser_ex2(String user_ex2) {
        this.user_ex2 = user_ex2;
    }

    public String getUser_ex3() {
        return user_ex3;
    }

    public void setUser_ex3(String user_ex3) {
        this.user_ex3 = user_ex3;
    }

    public String getUser_ex4() {
        return user_ex4;
    }

    public void setUser_ex4(String user_ex4) {
        this.user_ex4 = user_ex4;
    }

    public String getUser_ex5() {
        return user_ex5;
    }

    public void setUser_ex5(String user_ex5) {
        this.user_ex5 = user_ex5;
    }

    public String getUser_dat1() {
        return user_dat1;
    }

    public void setUser_dat1(String user_dat1) {
        this.user_dat1 = user_dat1;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_ex1='" + user_ex1 + '\'' +
                ", user_ex2='" + user_ex2 + '\'' +
                ", user_ex3='" + user_ex3 + '\'' +
                ", user_ex4='" + user_ex4 + '\'' +
                ", user_ex5='" + user_ex5 + '\'' +
                ", user_dat1='" + user_dat1 + '\'' +
                '}';
    }
}
