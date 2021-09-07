package com.zhouyunji.bean;

public class BoyService {
    private String name;
    private int age;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String  doSomething() {
        System.out.println(toString());
        return toString();
    }

    @Override
    public String toString() {
        return "BoyService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", length=" + length +
                '}';
    }
}
