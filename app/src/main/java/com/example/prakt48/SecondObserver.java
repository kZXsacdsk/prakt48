package com.example.prakt48;

public class SecondObserver implements Observer {
    @Override
    public void update(String data) {
        System.out.println("SecondObserver получил данные: " + data);
    }
}

