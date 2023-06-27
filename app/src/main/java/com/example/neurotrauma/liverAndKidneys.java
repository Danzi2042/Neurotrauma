package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class liverAndKidneys extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liver_and_kidneys);

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
        operations.add( new Operation("Поражение печени", "Первая помощь Отсутствует, Лечение Время, трансплантация печени Прогноз Выживают, При прогрессировании до печеночной недостаточности - тяжелая форма, Вызвано Сепсис, антибиотики, лучевая болезнь, злоупотребление алкоголем.",
                R.drawable.liver_damage));
        operations.add( new Operation("Желтуха", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредно, Вызвано Поражение печени.",
                R.drawable.jaundice));
        operations.add( new Operation("Вздутие", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредно, Вызвано Поражение печени.",
                R.drawable.stomach_ache));
        operations.add( new Operation("Повреждение почек", "Первая помощь Отсутствует, Лечение Время, пересадка почки, Прогноз Выживает, беспокоит, если прогрессирует до почечной недостаточности, Вызвано Сепсис, антибиотики, лучевая болезнь, гипотония, гипертония, Вызывает Почечная недостаточность, тошнота, рвота, отеки ног, повреждение костей.",
                R.drawable.liver_damage));
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