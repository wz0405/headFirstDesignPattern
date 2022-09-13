package chapter6;

public class Light {
    String where;
    public Light(String living) {
        this.where = living;
    }

    public void on() {
        System.out.println(where+"조명이 켜졌습니다.");
    }

    ;

    public void off() {
        System.out.println(where+"꺼졌습니다.");
    }
}
