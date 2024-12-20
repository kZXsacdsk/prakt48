package com.example.prakt48;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private DataSubject dataSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataSubject = new DataSubject();

        Observer firstObserver = new FirstObserver();
        Observer secondObserver = new SecondObserver();

        dataSubject.addObserver(firstObserver);
        dataSubject.addObserver(secondObserver);

        dataSubject.setData("Новые данные поступили");

        dataSubject.removeObserver(firstObserver);

        dataSubject.setData("ДАнные обновились");
    }
}