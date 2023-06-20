package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class blood extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

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
        operations.add( new Operation("Гемотрансфузионный шок", "Первая помощь Введение совместимых групп крови против кровопотери до прекращения симптомов, Лечение Введение совместимых групп крови против кровопотери до прекращения симптомов, Прогноз Опасно для жизни, Вызвано Введение несовместимой группы крови, Вызывает Кровопотеря, обширное поражение органов.",
                R.drawable.blood_transfusion_shock));
        operations.add( new Operation("Сепсис", "Первая помощь Отсутствует, Лечение Антибиотики, Прогноз Опасно для жизни, Вызвано Инфицированные раны, гангрена, Вызывает Судороги, лихорадка, обширное поражение органов, гипервентиляция, спутанность сознания, тахикардия, гипотония, гангрена.",
                R.drawable.sepsis));
        operations.add( new Operation("Кровопотеря", "Первая помощь Совместимые пакеты с кровью, Лечение Время, совместимые пакеты с кровью, Прогноз Зависит от степени тяжести, Вызвано Кровотечение, внутреннее кровотечение, Вызывает Гипоксемия, тахикардия, головная боль, слабость, бледность кожи, остановка сердца.",
                R.drawable.blood_loss));
        operations.add( new Operation("Гипоксемия", "Первая помощь Отсутствует, Лечение Лечение основных причин, Прогноз Зависит от степени тяжести, Вызвано Кислородное голодание, кровопотеря, остановка сердца, повреждение сердца, гипотония, гиповентиляция, одышка, повреждение легких, Вызывает Гипервентиляция, одышка, нейротравма, спутанность сознания, головная боль, остановка сердца, остановка дыхания, повреждение органов.",
                R.drawable.hypoxemia));
        operations.add( new Operation("Гипотония", "Первая помощь Внутривенные жидкости, адреналин, Лечение Лечение основных причин, Прогноз Зависит от степени тяжести, Вызвано Пневмоторакс, сепсис, повреждение сердца, кровопотеря, введение несовместимой группы крови, Вызывает Тахикардия, гипоксемия, бледность кожи, гипервентиляция, головокружение, нечеткость зрения, повреждение почек, остановка сердца, потеря сознания.",
                R.drawable.hypotension));
        operations.add( new Operation("Гипертония", "Первая помощь Сбор крови, Лечение Лечение основных причин, Прогноз Смертельно опасен в тяжелых случаях, Вызвано Чрезмерное внутривенное введение, поражение печени, адреналин, Вызывает Тахикардия, отеки ног, сердечный приступ, инсульт.",
                R.drawable.hypertension));
        operations.add( new Operation("Ацидоз", "Первая помощь Отсутствует, Лечение Лечение основных причин, Прогноз Выживают, Вызвано Солевой раствор, гиповентиляция, Вызывает Тахикардия, головная боль, слабость, спутанность сознания, тошнота, судороги, кома.",
                R.drawable.internal_bleeding));
        operations.add( new Operation("Алкалоз", "Первая помощь Физраствор + сбор крови, Лечение Лечение основных причин, Прогноз Выживают, Вызвано Гипервентиляция, Вызывает Потливость, сердцебиение, судороги.",
                R.drawable.internal_bleeding));
        operations.add( new Operation("Бледная кожа", "Первая помощь Отсутствует, Лечение Лечение основных причин, Прогноз Выживают, Вызвано Кровопотеря, гипотония.",
                R.drawable.pale_skin));
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