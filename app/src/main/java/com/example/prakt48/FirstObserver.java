package com.example.prakt48;

public class FirstObserver implements Observer {
    @Override
    public void update(String data) {
        System.out.println("FirstObserver получил данные: " + data);
    }
}
