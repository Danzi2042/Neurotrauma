package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OperationAdapter extends RecyclerView.Adapter<OperationAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Operation> operations; // поле коллекции контейнера для хранения данных (объектов класса operation)

    // конструктор адаптера
    public OperationAdapter(Context context, List<Operation> operations) {
        this.inflater = LayoutInflater.from(context);
        this.operations = operations;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту operation
    @Override
    public OperationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту operation по определенной позиции
    @Override
    public void onBindViewHolder(OperationAdapter.ViewHolder holder, int position) {
        Operation operation = operations.get(position);
        holder.operationView.setImageResource(operation.getOperationResource());
        holder.nameView.setText(operation.getName());
        holder.operationDescriptionView.setText(operation.getOperationDescription());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return operations.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView operationView;
        final TextView nameView, operationDescriptionView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            operationView = view.findViewById(R.id.operationResource);
            nameView = view.findViewById(R.id.name);
            operationDescriptionView = view.findViewById(R.id.operationDescription);
        }
    }
}