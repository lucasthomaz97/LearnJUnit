package org.example;

public class App {
    public String getHello() {
        return "Hello, JUnit!";
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(new App().getHello());
    }
}
