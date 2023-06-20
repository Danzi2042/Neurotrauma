package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class allTrauma extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_trauma);

        button = findViewById(R.id.button);
        button.setOnClickListener(listener);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_operation);

        // создадим адаптер и загрузим в него контейнер с данными
        OperationAdapter adapter = new OperationAdapter(this, operations);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        operations.add( new Operation("В огне", "Первая помощь Огнетушитель, вода или любой водолазный костюм,Лечение Бинтование сильно обожженных частей тела,Прогноз Зависит от того, как долго пациент горел,Вызвано Пожары,Вызывает Массивные ожоги.",
                R.drawable.cardiac_arrest));
        operations.add( new Operation("Инфицированная рана", "Первая помощь Мазь или антисептик, бинты, Лечение Мазь или антисептик, бинты, Прогноз Беспокойство, Вызвано Незалеченные раны или ожоги, Вызывает Сепсис, некроз, воспаление.",
                R.drawable.cardiac_tamponade));
        operations.add( new Operation("Инородное тело", "Первая помощь Отсутствует, Лечение Операция с пинцетом, Прогноз Выживают, Вызвано Выстрел, Вызывает Воспаление, артериальные порезы при очень сильном воспалении.",
                R.drawable.cardiac_tamponade));
        operations.add( new Operation("Сильная боль", "Первая помощь Опиоиды, Лечение основных причин, Прогноз Физически безвреден, Вызвано Повреждение органов, вывихи, переломы.",
                R.drawable.cardiac_tamponade));
        operations.add( new Operation("Воспаление", "Первая помощь Отсутствует, Лечение основных причиy, Прогноз Полезный (помогает в борьбе с инфекцией), Вызвано инфицированные раны, инородные тела.",
                R.drawable.tremor));
        operations.add( new Operation("Спазмы", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредный, Вызвано Припадки.",
                R.drawable.tremor));
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
            startActivity(intent);

        }
    };
}