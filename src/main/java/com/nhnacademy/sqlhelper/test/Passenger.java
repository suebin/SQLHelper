package com.nhnacademy.sqlhelper.test;

public class Passenger {
    private int passengerNo;
    private String passengerName;
    private int grade;
    private int age;

    public Passenger(int passengerNo, String passengerName, int grade, int age) {
        this.passengerNo = passengerNo;
        this.passengerName = passengerName;
        this.grade = grade;
        this.age = age;
    }

    public int getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(int passengerNo) {
        this.passengerNo = passengerNo;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerNamee(String name) {
        this.passengerName = passengerName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerNo=" + passengerNo +
                ", passengerName='" + passengerName + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}
