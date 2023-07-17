package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class LimbsAndTorso extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limbs_and_torso);

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
        operations.add( new Operation("Артериальное кровотечение", "Оказание первой помощи нанести жгут, лечение операцией, прогноз тревожный.",
                R.drawable.arterial_bleeding));
        operations.add( new Operation("Внутреннее кровотечение", "Первая почощь Внутривенные жидкости, Лечение Операция, Прогноз Зависит от степени тяжести,вызвано Травмы, лучевая болезнь, вызывает Кровопотеря.",
                R.drawable.internal_bleeding));
        operations.add( new Operation("Боль в животе", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредно, Вызвано Поражение печени.",
                R.drawable.stomach_ache));
        operations.add( new Operation("Потеет", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредно,вызвано Наркомания, сердечный приступ.",
                R.drawable.sweating));
        operations.add( new Operation("Лихорадка", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредно, Вызвано Сепсис, радиационное поражение легких.",
                R.drawable.fever));
        operations.add( new Operation("Гангрена", "Первая помощь Отсутствует, Лечение Хирургическая ампутация, Прогноз Зависит от степени тяжести, вызвано Прекращение кровотока вследствие наложения жгута или баллона, сепсис, вызывает Сепсис.",
                R.drawable.gangrene));
        operations.add( new Operation("Отек ног", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредный, вызвано Поражение печени, почек, сердечная недостаточность, гипертония.",
                R.drawable.swelling_of_the_legs));
        operations.add( new Operation("Слабость", "Первая помощь Отсутствует, Лечение основных причин, Прогноз Безвредный, вызвано Тампонада сердца, кровопотеря, ацидоз.",
                R.drawable.weakness));
        operations.add( new Operation("Разрыв аорты", "Первая помощь Отсутствует, Лечение: 1 Опиоид 2 Скальпель 3 Эндоваскулярный баллон 4Медицинский стент 5 Шовный материал Прогноз Выживание очень маловероятно, Вызвано Сильное кровотечение, Вызывает Массивная кровопотеря.",
                R.drawable.arterial_bleeding));
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