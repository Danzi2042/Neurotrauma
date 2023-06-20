package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class bones extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bones);

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
        operations.add( new Operation("Костная смерть", "Первая помощь Отсутствует, Лечение Операция по декомпрессии сердечника, Прогноз Изнурительный, Вызвано Чрезмерное повреждение костей, Вызывает Спонтанные переломы в любой части тела.",
                R.drawable.bone_death));
        operations.add( new Operation("Переломы", "Первая помощь Бинт + гипс, Лечение Остеоинтезная хирургия, Прогноз Ухудшение, Вызвано Травма, неудачное вправление вывиха, Вызывает Боль, при переломах ребер: пневмоторакс, при переломах шеи: паралич.",
                R.drawable.fractute));
        operations.add( new Operation("Повреждение костей", "Первая помощь Отсутствует, Лечение основных причин или операция остеоинтезирования, Прогноз Выживают, Вызвано Почечная недостаточность.",
                R.drawable.bone_death));
        operations.add( new Operation("Вывих", "Первая помощь Бинт, пластилин, опиоиды, Лечение Забивание гаечным ключом (использовать для лечения, как бинт) Прогноз Ухудшение, Вызвано Травмы, падения, Вызывает Боль, переломы при неправильном обращении.",
                R.drawable.dislocation));
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