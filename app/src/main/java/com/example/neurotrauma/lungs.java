package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class lungs extends AppCompatActivity {

    private Button button;
    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lungs);

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
        operations.add( new Operation("Остановка дыхания", "Первая помощь    СЛР, Лечение Лечение основных причин,    Прогноз    Обычно управляемый, Вызвано    Нейротравмa, гипоксемия, передозировка опиатов, Вызывает Низкий уровень кислорода.",
                R.drawable.respiratory_arrest));
        operations.add( new Operation("Повреждение лёгких", "Первая помощь    Отсутствует, Лечение    Время, трансплантация легких, Прогноз    Выживают. При прогрессировании до легочной недостаточности - тяжелая форма, Вызвано    Сепсис, антибиотики, лучевая болезнь, курение, Вызывает Гипоксемия, легочная недостаточность, кашель, одышка, боль в груди.",
                R.drawable.pneumothorax));
        operations.add( new Operation("Радиационное поражение легких", "Первая помощь    Отсутствует, Лечение    Время, трансплантация легких, Прогноз    Выживают. При прогрессировании до легочной недостаточности - тяжелая форма, Вызвано    Лучевая болезнь, Вызывает Гипоксемия, кашель, одышка, боль в груди, лихорадка.",
                R.drawable.pneumothorax));
        operations.add( new Operation("Пневмоторакс", "Первая помощь    Игла, Лечение    Дренаж во время операции, Прогноз    Выживает. мрачный, если развивается достаточно далеко., Вызвано     Травма, нелеченный перелом ребра, Вызывает Гипотония, гипоксемия, одышка, тахикардия, гипервентиляция, боль в груди.",
                R.drawable.pneumothorax));
        operations.add( new Operation("Одышка", "Первая помощь    Отсутствует, Лечение    Лечение основных причин, Прогноз Мрачное, Вызвано Введение несовместимой группы крови.",
                R.drawable.dyspnea));
        operations.add( new Operation("Кашель", "Первая помощь    Отсутствует, Лечение    Лечение основных причин, Прогноз    Выживают, Вызвано Повреждение легких, повреждение сердца, остановка сердца.",
                R.drawable.cough));
        operations.add( new Operation("Гиповентиляция", "Первая помощь    Отсутствует, Лечение    Лечение основных причин, Прогноз    Выживают, Вызвано    Седация, передозировка опиатов, Вызывает Гипоксемия, ацидоз.",
                R.drawable.hypoventilation));
        operations.add( new Operation("Одышка / затрудненное дыхание", "Первая помощь    Отсутствует,Лечение    Лечение основных причин, Прогноз    Выживают, Вызвано    Сердечный приступ, сердечная недостаточность, гипоксемия, повреждение легких, пневмоторакс, тампонада сердца, Вызывает Гипоксемия.",
                R.drawable.shortness_breath));
        operations.add( new Operation("Гипервентиляция", "Первая помощь    Отсутствует, Лечение    Лечение основных причин, Прогноз    Выживают, потенциально выгодны, Вызвано    Гипоксемия, гипотензия, пневмоторакс, сепсис, Вызывает Алкалоз, гипоксемия.",
                R.drawable.hyperventilation));
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
            startActivity(intent);

        }
    };
}