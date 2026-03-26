package com.java.sm.oops.encapsulation;

public class UserPassword {
    private String password;
    public  void setPassword (String password)
    {
        if(password.length() >=4)
        {
            this.password = password;
        }
        else {
            System.out.println("Weak Password");
        }
    }
    public String getPassword()
    {
        return "*******";
    }
    public static void main(String[] args) {
        UserPassword up = new UserPassword();
        up.setPassword("12345");
        System.out.println(up.getPassword());

    }
}
