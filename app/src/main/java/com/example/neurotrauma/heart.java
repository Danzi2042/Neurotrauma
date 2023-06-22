package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class heart extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
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
        operations.add( new Operation("Остановка сердца", "Первая помощь СЛР, дефибриллятор, Лечение основных причин, Прогноз Обычно управляемый, Вызвано Кровопотеря, гипотония, гипертония, гипоксемия, кома, Вызывает Гипоксемия, кома.",
                R.drawable.cardiac_arrest));
        operations.add( new Operation("Сердечный приступ", "Первая помощь Отсутствует, Лечение Время, лечение причины, Прогноз Беспокойный, Вызвано Гипертония, Вызывает Повреждение сердца, остановка сердца, боль, тошнота, потливость, одышка.",
                R.drawable.cardiac_tamponade));
        operations.add( new Operation("Сердечная тампонада", "Первая помощь Отсутствует, Лечение Операция, Прогноз Выживают, но если их оставить надолго, то состояние ухудшается, Вызвано Травма, Вызывает Гипотония, одышка, слабость, кашель, головокружение.",
                R.drawable.cardiac_tamponade));
        operations.add( new Operation("Повреждение сердца", "Первая помощь Отсутствует, Лечение Время, пересадка сердца, Прогноз Выживают, при прогрессировании сердечной недостаточности - тяжелая форма, Вызвано Сердечный приступ, сепсис, антибиотики, лучевая болезнь, Вызывает Гипоксемия, гипотензия, сердечная недостаточность, остановка сердца, одышка, отек ног.",
                R.drawable.cardiac_tamponade));
        operations.add( new Operation("Тремор", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Выживают, Вызвано алкалоз.",
                R.drawable.tremor));
        operations.add( new Operation("Тахикардия / Увеличение частоты \nсердечных сокращений", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Выживают, потенциально выгодно, Вызвано Сепсис, пневмоторакс, кровопотеря, гипотония, ацидоз, Вызывает Гипертония, счетчики гипоксемии.",
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