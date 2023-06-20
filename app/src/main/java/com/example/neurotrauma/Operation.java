package com.example.neurotrauma;

public class Operation {

    private String name; // поле названия операции
    private String operationDescription; // поле описания операции
    private int operationResource; // поле ресурса операции

    // конструктор
    public Operation(String name, String operationDescription, int operationResource) {
        this.name = name;
        this.operationDescription = operationDescription;
        this.operationResource = operationResource;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public int getOperationResource() {
        return operationResource;
    }

    public void setOperationResource(int operationResource) {
        this.operationResource = operationResource;
    }

    }

