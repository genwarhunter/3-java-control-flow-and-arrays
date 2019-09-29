package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] week = new String[]{"понедельник", "вторник","среда","четверг","пятница","суббота","воскресенье"};
        if (weekDaysNumber-1<=6 && weekDaysNumber-1>=0){
            return week[weekDaysNumber-1];
        }
        return "такого дня недели не существует";
    }
}