package com.hillel.suraieva;

public class ArraySizeException extends Exception{
    public String toStr(){
        return "Ошибка: неправильный размер матрицы, нужна 4 на 4";
    }
}
