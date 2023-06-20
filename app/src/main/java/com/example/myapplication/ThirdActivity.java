package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {


    private Button button,button2,button3,button4,button5,button6,button7,button8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button = findViewById(R.id.button);
        button.setOnClickListener(listener);

        // присваивание id полям
        button2 = findViewById(R.id.button2);
        // обработка нажатия кнопки
        button2.setOnClickListener(listener2);

        // присваивание id полям
        button3 = findViewById(R.id.button3);
        // обработка нажатия кнопки
        button3.setOnClickListener(listener3);

        // присваивание id полям
        button4 = findViewById(R.id.button4);
        // обработка нажатия кнопки
        button4.setOnClickListener(listener4);

        // присваивание id полям
        button5 = findViewById(R.id.button5);
        // обработка нажатия кнопки
        button5.setOnClickListener(listener5);
        // присваивание id полям

        button6 = findViewById(R.id.button6);
        // обработка нажатия кнопки
        button6.setOnClickListener(listener6);

        // присваивание id полям
        button7 = findViewById(R.id.button7);
        // обработка нажатия кнопки
        button7.setOnClickListener(listener7);

        // присваивание id полям
        button8 = findViewById(R.id.button8);

        // обработка нажатия кнопки
        button8.setOnClickListener(listener8);
    }



    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), OperationInfo.class);
            startActivity(intent);

        }
    };



    private View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), heart.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), LimbsAndTorso.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), allTrauma.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener5 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), brain.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener6 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), liverAndKidneys.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener7 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener8 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
            startActivity(intent);

        }
    };
}