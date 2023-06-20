package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class brain extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain);

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
        operations.add( new Operation("Нейротравма", "Первая помощь Отсутствует,Лечение Маннитол (требуется длительное время), Прогноз Главный антагонист. Вызвано низким притоком кислорода к мозгу. Непременная смерть при длительном кислородном голодании,Вызвано  Гипоксемия, инсульт, Вызывает Потеря сознания, остановка дыхания, смерть.",
                R.drawable.neurotrauma));
        operations.add( new Operation("Инсульт(в оф. переводе мода удар)", "Первая помощь Отсутствует, Лечение Операция, Прогноз Инсульт следует лечить как можно скорее, чтобы свести к минимуму риск смерти, Вызвано Гипертония, Вызывает Нейротравма, кома, судороги, боль, головная боль.",
                R.drawable.stroke));
        operations.add( new Operation("Кома", "Первая помощь Отсутствует, Лечение Авто пульс и много времени, Прогноз Основные причины следует лечить как можно скорее, иначе пациент может впасть в стойкое вегетативное состояние, Вызвано Остановка сердца, инсульт, ацидоз, Вызывает Остановка сердца, остановка дыхания, потеря сознания.",
                R.drawable.stroke));
        operations.add( new Operation("Рвота кровью", "Первая помощь Внутривенные жидкости, Лечение Операция, Прогноз Рвота кровью вызывается опасным внутренним кровотечением, Вызвано Внутреннее кровотечение, Вызывает Кровопотеря.",
                R.drawable.vomithing_blood));
        operations.add( new Operation("Припадок", "Первая помощь Удаление из небезопасной среды Лечение Лечение причин Прогноз В зависимости от причины может быть опасным для жизни Вызвано Инсульт, ацидоз, алкалоз, лучевая болезнь Вызывает Мышечные спазмы.",
                R.drawable.fever));
        operations.add( new Operation("Без сознания", "Первая помощь Удаление из небезопасной среды, Лечение Лечение причин, Прогноз Зависит от причины. Приводит к тому, что все психические симптомы становятся невидимыми, Вызвано Гипотония, состояние здоровья ниже 0, кома, нейротравма.",
                R.drawable.unconscious));
        operations.add( new Operation("Рвота", "Первая помощь Отсутствует, Лечение Лечение причин, Прогноз Зависит от причины, Вызвано, Почечная недостаточность, алкогольная интоксикация.",
                R.drawable.vomithing));
        operations.add( new Operation("Тошнота", "Первая помощь Отсутствует, Лечение Лечение причин, Прогноз Зависит от причины, Вызвано Почечная недостаточность, алкогольная интоксикация, лучевая болезнь.",
                R.drawable.vomithing));
        operations.add( new Operation("Головная боль", "Первая помощь Отсутствует, Лечение Лечение причин, Прогноз Зависит от причины, Вызвано кровопотеря, ацидоз, инсульт, гипоксемия, гипотония.",
                R.drawable.dizziness));
        operations.add( new Operation("Легкое головокружение", "Первая помощь Отсутствует, Лечение Лечение причин, Прогноз Зависит от причины гипотонии, Вызвано Гипотония.",
                R.drawable.dizziness));
        operations.add( new Operation("Спутанность сознания", "Первая помощь Отсутствует, Лечение Лечение причин, Прогноз Зависит от причины, Вызвано Ацидоз, гипотония, гипоксемия, сепсис.",
                R.drawable.dizziness));
        operations.add( new Operation("Размытое зрение", "Первая помощь Отсутствует, Лечение Лечение причин, Прогноз Зависит от причины гипотонии, Вызван Гипотония.",
                R.drawable.blurred_vision));
        operations.add( new Operation("Ломка", "Первая помощь Налоксон, Лечение Налоксон, Прогноз Варьируется, Вызвано Злоупотребление психоактивными веществами, абстиненция.",
                R.drawable.withdrawal));
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