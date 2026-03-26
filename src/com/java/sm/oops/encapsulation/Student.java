package com.java.sm.oops.encapsulation;

public class Student {
  private    int age ;
  public void setAge(int age)
  {
      if(age>0) {
          this.age = age;
      }
      else {
          System.out.println("Invalid age ");
      }
  }
  public  int getAge()
  {
      return age;
  }
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(4);
        System.out.println(s.getAge());
    }
}
