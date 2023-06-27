package com.example.neurotrauma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class itemForSurgery extends AppCompatActivity {

    private Button button;



    List<Operation> operations = new ArrayList<Operation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_for_surgery);

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
        operations.add( new Operation("Скальпель", "Производится в Изготовителе, Используется для Начало операции, Важность Существенные.",
                R.drawable.scalpel));
        operations.add( new Operation("Зажим", "Производится в Изготовителе, Используется для Остановка кровопотери из за разреза скальпелем операции, Важность Существенные.",
                R.drawable.clamp));
        operations.add( new Operation("Расширитель", "Производится в Изготовителе, Используется для Хирургия, Важность Существенные.",
                R.drawable.expander));
        operations.add( new Operation("Полустерильные плоскогубцы", "Производится в Изготовителе, Используется для Удаление тканей или предметов из тела во время операции, Важность Важно.",
                R.drawable.pliers));
        operations.add( new Operation("Хирургическая дрель", "Производится в Изготовителе, Используется для Подготовка костей к установке имплантатов во время операции, Важность Важно Важно.",
                R.drawable.surgical_drill));
        operations.add( new Operation("Хирургическая пила", "Производится в Изготовителе, Используется для Ампутация конечностей во время операции, Важность Неважен.",
                R.drawable.saw));
        operations.add( new Operation("Скальпели для извлечения органов", "Производится в Изготовителе, Используется для Удаление органов во время операции. Существует пять типов: сердце, легкие, печень, мозг и почки, Важность Неважен.",
                R.drawable.organ_scalpel));
        operations.add( new Operation("Дренаж", "Производится в Медицинский фабрикаторе, Используется для лечения Пневмоторакс. Требуется использовать расширитель, Важность  важно.",
                R.drawable.drainage));
        operations.add( new Operation("Остеосинтетические имплантаты", "Производится в Изготовителе, Используется для лечения Переломы. Требуется сверление костей, Важность Очень важно.",
                R.drawable.implants));
        operations.add( new Operation("Имплантаты спинного мозга", "Производится в Изготовителе, Используется для лечения Паралич. Требуется хирургическое вмешательство, Важность Неважен.",
                R.drawable.cord_implant));
        operations.add( new Operation("Эндоваскулярные баллоны и\n медицинские стенты", "Производится в Медицинский фабрикаторе, Используется для лечения Разрыв аорты. Расширитель не требуется, Важность Важно.",
                R.drawable.medical_stent));
        operations.add( new Operation("Холодильные контейнеры", "Производится в Изготовителе, Используется для Хранение органов и конечностей, Важность Очень важно.",
                R.drawable.refrigerated_container));
        operations.add( new Operation("Трансплантация органов", "Производится в Операции по заготовке органов, привокзальных магазинах, Используется для лечения Повреждение органа, отказ органа. Требуется операция, Важность Очень важно.",
                R.drawable.heart));
        operations.add( new Operation("Пересадка мозга", "Производится в Операции по закупке органов, Может использоваться для переноса сознания одного человека в тело другого. Не следует ожидать, что пациент выживет без серьезных повреждений., Важность Зачем ты вообще это делаешь?",
                R.drawable.brain));
        operations.add( new Operation("Глаза", "Может быть поврежден и удален Повреждение вызывает искажение экрана Может быть поврежден в результате: Нейротравма, переломы черепа, низкая концентрация кислорода, инсульт, сепсис и аутоиммунная ретинопатия Аутоиммунная ретинопатия может случайно возникнуть при пересадке глаз. Она медленно повреждает глаза и требует пересадки для излечения. Не забывайте хранить все органы в холодильнике Слепота приводит к обнулению всех навыков (пока вы не получите новый глаз) и добавляет темное наложение. Быстро разрушается в воде без какой-либо защиты При повреждении может получить катаракту.",
                R.drawable.eye));
        operations.add( new Operation("Бионические глаза", "То же, что и глаз, но более устойчив Вне организма умирает гораздо медленнее Не повреждается при нейротравмах, низкой концентрации кислорода и инсультах. Аутоиммунная ретинопатия встречается гораздо реже. Улучшает зрение пользователя Умножает все навыки на 1,15.",
                R.drawable.bionic_eye));
        operations.add( new Operation("Глаза ночного видения", "Дает вам ночное видение Ночное видение всегда включено, даже когда вы этого не хотите.",
                R.drawable.nightvisioneye));
        operations.add( new Operation("Инфракрасные глаза", "Немного усложняет видимость (окрашивает экран в синий цвет) Увеличивает ваши навыки на 1,08.",
                R.drawable.infrared));
        operations.add( new Operation("Пластиковые глаза", "Очень трудно видеть Хуже, чем обычный глаз почти во всех отношениях Дешевый в производстве Высокая вероятность аутоиммунной ретинопатии Снижает ваши навыки.",
                R.drawable.plasticeye));
        operations.add( new Operation("Глаза монстра", "Несколько затрудняет видимость Получается из монстров Используется при изготовлении обычного глазного яблока Высокий шанс аутоиммунной ретинопатии Не повреждается под водой.",
                R.drawable.monstereye));
        operations.add( new Operation("Глаз хаска", "Превращает зрение в фиолетовый цвет Не может быть поврежден водой Используется при изготовлении обычного глазного яблока Улучшает ваши навыки Очень маленький шанс заражения хаск инфекцией время от времени.",
                R.drawable.huskeye));
        operations.add( new Operation("Глазные капли", "Ускоряет исцеление глаз Не может исцелять больше 50%(потому что один из глаз мертв при повреждении более 50%)",
                R.drawable.eyedrops));
        operations.add( new Operation("Мышечные соединители", "Используйте перед введением в глаз, вместе с гелем для глаз Необходим для пересадки глаз.",
                R.drawable.muscleconnectors));
        operations.add( new Operation("Гель для глаз", "Используйте перед введением в глаз, вместе с мышечными соединителями Необходимы для пересадки глаз.",
                R.drawable.eyegel));
        operations.add( new Operation("скальпель для глаз", "Используйте на человеке с глазами для их удаления (обязательно дайте морфин и сначала используйте расширители) Обязательно дайте человеку анестетики перед операцией, иначе она может закончиться катастрофой Изготовлен так же, как и другие органные скальпели.",
                R.drawable.organ_scalpel));
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