package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class firstAidItem extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid_item);

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
        operations.add( new Operation("Сканер здоровья", "Производится в Изготовитель, Используется для Сканирование на предмет глубинных причин симптомов. Вызывает незначительную лучевую болезнь. Сведите сканирование к минимуму, Важность Существенные.",
                R.drawable.health_scaner));
        operations.add( new Operation("Медицинский контейнер", "Производится в Изготовитель, Используется для Может хранить медицинское оборудование и не требует руки для переноски, Важность Очень важно.",
                R.drawable.medical_stent));
        operations.add( new Operation("Шовный материалы", "Производится в Медицинский фабрикатор, Используется для лечения Открытые раны, кровотечения, прекращение операций, Важность Существенные.",
                R.drawable.suture_material));
        operations.add( new Operation("Бинт, эластичный бинт, антибиотический клей", "Производится в Медицинский фабрикатор, Используется для лечения Открытые раны, ожоги, предотвращает инфекцию; повязка и пластилин стабилизируют вывихи и переломы для последующего лечения, Важность Существенные.",
                R.drawable.bandage));
        operations.add( new Operation("Пакет крови", "Производится в Использование пустых пакетов для крови у пациентов, Используется для лечения Кровопотеря, Важность Существенные.",
                R.drawable.blood_bag));
        operations.add( new Operation("Физраствор, раствор Рингера", "Производится в Медицинский фабрикатор, Используется для лечения Низкое кровяное давление, Важность Важно.",
                R.drawable.saline));
        operations.add( new Operation("Опиоиды (опиум, морфин, фентанил)", "Производится в Медицинский фабрикатор, Используется для лечения Боль. Необходимая для проведения операции, Важность Существенные.",
                R.drawable.opium));
        operations.add( new Operation("Антибиотическая мазь", "Производится в Медицинский фабрикатор, Используется для лечения Ожоги, инфицированные раны, Важность Важно.",
                R.drawable.antibiotic_cream));
        operations.add( new Operation("Жгут", "Производится в Медицинский фабрикатор, Используется для лечения Кровотечение из артерий. Операция должна последовать как можно скорее, чтобы избежать гангрены, Важность Очень важно.",
                R.drawable.tourniquet));
        operations.add( new Operation("Гипс", "Производится в Медицинский фабрикатор, Используется для лечения Переломы конечностей (требует предварительного наложения повязки), Важность Очень важно.",
                R.drawable.gypsum));
        operations.add( new Operation("Дефибрилляторы", "Производится в Изготовитель, Используется для лечения Остановка сердца, Важность Важно.",
                R.drawable.defibrillator));
        operations.add( new Operation("автопульс", "Производится в Изготовитель, Используется для лечения Остановка сердца, остановка дыхания, низкий уровень кислорода, Важность Очень важно.",
                R.drawable.autopulse));
        operations.add( new Operation("Маннитол", "Производится в Медицинский фабрикатор, Используется для лечения Нейротравма, требует стабилизации кровяного давления и кислорода, Важность Очень важно.",
                R.drawable.mannitol));
        operations.add( new Operation("Азатиоприн", "Производится в Медицинский фабрикатор, Используется для поддержание иммуннитета на низком уровне, чтобы свеже-имплантированные органы не были убиты организмом, Важность Обязательно для трансплантации.",
                R.drawable.immunosuppressant));
        operations.add( new Operation("Мешок для трупа", "Производится в Медицинский фабрикатор, Используется для Позволяет быстрее транспортировать тела - живые или умершие, Важность Неважен.",
                R.drawable.body_bag));
        operations.add( new Operation("Стазис-мешок", "Производится в Медицинский фабрикатор, Используется для Временно останавливает большинство биологических процессов, позволяя транспортировать пострадавшего для дальнейшего лечения. Рекомендуется держать наготове дефибриллятор, когда нужно снять мешок, Важность Очень важно.",
                R.drawable.stasis_bag));
        operations.add( new Operation("Инвалидная коляска", "Производится в Медицинский фабрикатор, Используется для Позволяет пациентам свободно передвигаться, пока их руки целы, Важность Неважен.",
                R.drawable.wheelchair));
        operations.add( new Operation("Игла", "Производится в Медицинский фабрикатор, Используется для лечения Пневмоторакс. Это только мера первой помощи, Важность Важно.",
                R.drawable.spine));
        operations.add( new Operation("Гематологический анализатор и пустая карта донора", "Производится в Изготовитель, Используется для Определение группы крови и анализ крови, Важность Неважен.",
                R.drawable.hematological_analyzer));
        operations.add( new Operation("Травматологические ножницы", "Производится в Изготовитель, Используется для Снятие повязок и гипсов, Важность Важно.",
                R.drawable.traumashears));
        operations.add( new Operation("Антисептический спрей и антисептик", "Производится в Изготовитель, Используется для лечения Инфицированные раны, Важность Важно.",
                R.drawable.antiseptic_spray));
        operations.add( new Operation("Корректирующие очки", "Немного помогает со зрением (снимает нечеткость зрения) Занимает слот для головы.",
                R.drawable.glasses));
        operations.add( new Operation("Усовершенствованное устройство для извлечения глазного яблока", "Ударьте им ползуна, мудраптора или молотоголава, чтобы получить его глаза Попадите в любого хаска или заражённых монстров, чтобы получить глаза хаска. Не может быть использован на людях или мертвых существах Ломается после 1 использования Очень сложный в использовании.",
                R.drawable.spoon));
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