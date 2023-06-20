package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class cyberneticsAndEyes extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cybernetics_and_eyes);

        button = findViewById(R.id.button);
        button.setOnClickListener(listener);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_eye);

        // создадим адаптер и загрузим в него контейнер с данными
        OperationAdapter adapter = new OperationAdapter(this, operations);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        operations.add( new Operation("Материальный ущерб", "Причина    Травмы, передвижение с ослабленными винтами, Лечение    Сталь, Прогноз Основной тип урона. Конечность теряется, если этот показатель достигает максимума.",
                R.drawable.material_damage));
        operations.add( new Operation("Повреждение электроники", "Причина    Травмы, ожоги, контакт с водой, Лечение    Схема на базе ППВМ, Прогноз Вторичный тип повреждения. В зависимости от степени повреждения электроники конечность будет чаще выходить из строя. Она полностью перестанет функционировать, если этот показатель достигнет максимума.",
                R.drawable.electronics_damage));
        operations.add( new Operation("Ослабленные винты", "Причина    Травма, Лечение    Отвертка, Прогноз Чем слабее винты, тем больше имплант подвержен потере материала и повреждению электроники. При достаточной высоте и движении может ухудшиться и привести к потере материала.",
                R.drawable.loosened_screws));
        operations.add( new Operation("Гнутый металл", "Причина    Травма, Лечение    Сварочный аппарат, Прогноз Функция конечности будет ухудшаться тем больше, чем сильнее согнут ее металл.",
                R.drawable.bent_metal));
        operations.add( new Operation("аутоиммунную ретинопатия", "Причина иммуниет во время операции на глаза не был подавлнен Прогноз выживают при своевременном  вмешательстве медика.",
                R.drawable.eyeshock));
        operations.add( new Operation("катаракта", "Причина общее повреждение глаз Прогноз ускоряет процесс отмирания глаз 50% смерть 1 глаза 100% 2 глаз",
                R.drawable.cataract));
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