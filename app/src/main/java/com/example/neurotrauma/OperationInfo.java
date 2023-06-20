package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class OperationInfo extends AppCompatActivity {

    private Button button;

    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation_info);

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
        operations.add( new Operation("Шаг 1 и шаг 2:Aнесетики и разрезаем", "Для начала операции необходима анестезия. Введите пациенту опиоид по вашему выбору или пропофол.Используйте скальпель на той части тела, на которой вы хотите провести операцию.",
                R.drawable.incision));
        operations.add( new Operation("Шаг 3:Зажимаем", "Используйте Зажим на части тела, которую вы надрезали.",
                R.drawable.clamping));
        operations.add( new Operation("Шаг 4: Оттягиваем", "Используйте расширитель на части тела, которую вы надрезали.",
                R.drawable.prolonging));
        operations.add( new Operation("Остеосинтетическая хирургия", "Эта процедура поможет залечить переломы и повреждения костей Сначала проведите стандартную хирургическую процедуру.Шаг 5: Сверление сломанной кости,Используйте хирургическое дрель на сломанной кости.Шаг 6: Имплантаты,Используйте имплантаты для остеосинтеза на пораженной кости. Перелом заживает.",
                R.drawable.bone_drilling));
        operations.add( new Operation("Хирургия по закупке/трансплантации органов", "Эта процедура позволит извлечь органы из еще живых людей и по желанию пересадить новый орган.Сначала проведите стандартную операцию на туловище.Шаг 5: Вырезаем это Используйте один из специализированных скальпелей для извлечения органов на туловище. Вы должны получить орган(ы) пациента. Если повреждение органа было слишком большим, орган(ы) будет(ут) уничтожен(ы).Шаг 6 (необязательный): Пересадка Поместите заменяемый орган внутрь пациента.ПРЕДУПРЕЖДЕНИЕ: Если при выполнении этого шага пациент не находится под иммуносупрессией, орган может отторгнуться и не функционировать! Если вы планируете пересадить орган, сначала введите иммунодепрессант и следите за иммунитетом пациента с помощью гематологического анализатора.",
                R.drawable.organ_transplantation));
        operations.add( new Operation("Ампутация / операция по прикреплению конечности", "В ходе этой процедуры ампутируется одна из конечностей пациента.Сначала выполните стандартную операцию на конечности, которую вы хотите ампутировать.Шаг 5: Распиливание кости Используйте хирургическую пилу на пораженной конечности. Окончание операции сейчас приведет к ампутации конечности.Шаг 6 (необязательный): Прикрепление конечности Используйте отрезанную конечность на распиленной кости. Ампутация должна быть восстановлена.",
                R.drawable.bone_sawing));
        operations.add( new Operation("Операция по декомпрессии сердечника", "Эта процедура лечит смерть костей. Лучше всего сначала пересадить пациенту свежую почку, чтобы смерть костей не вернулась после операции. Чтобы успешно обратить вспять смерть костей, вам потребуется провести остеосинтетическую операцию на каждом участке тела за относительно небольшой промежуток времени. Возвращение мертвых костей к жизни - не малый подвиг. Вам следует взять с собой дополнительные имплантаты для остеосинтеза на случай, если что-то пойдет не так.",
                R.drawable.organ_transplantation));
        operations.add( new Operation("Удаление глаза", "1 Дать анестетики (или вырубить человека) 2 Используйте расширитель 3 Использовать глазной скальпель.",
                R.drawable.eye));
        operations.add( new Operation("Пересадка глаза", "1 Получить любой глаз 2 Использовать расширитель 3 Использовать соединители мышц 4 Использовать гель для глаз 5 Использовать глаз, чтобы вставить его обратно.",
                R.drawable.bionic_eye));
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