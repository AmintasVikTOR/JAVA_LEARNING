package com.company.garage;
/*
 * класс будет отображать сущность – автомобиль
 * Атрибуты класса - двигатель, подвеска, кузов, четыре колеса и т.д
 * Методы класса - 1) «открыть дверь», 2)«нажать на педаль газа», 3)«закачать порцию бензина из бензобака в двигатель»:
 * 1-2: доступны для выполнения другим классам (в частности, классу «Водитель»)
 * 3-  описывает взаимодействия внутри класса и не доступен пользователю.
 * Пользователи - челы, которые ИСПОЛЬЗУЮТ мой класс, в т.ч. и я сам
 * Разработчик - автор класса - яСам)
 * Каждый автомобиль - объет моего класса. Каждый авто(объект) уникален. У него свой цвет, свои колеса, ВИН и т.п.
 * Объект - это "представитель" моего класса. Их может быть масса..
 * Для взаимодействия с объектами класса используются существуют прекраснейшие интферфейсы...
 * Как правило в них описываем "что должно уметь машиниться", а реализация коронуется в классе-Ах.
 * По сути интерфейс определяет, насколько масштабно класс будет реализовывать описанные методы
 * Пример интерфейса - приборная панель.которая позволяет вызвать такие методы,
 * как увеличение скорости, торможение, поворот, переключение передач, включение фар, и т.п.
 * То есть все действия, которые может осуществить другой класс (в нашем случае – водитель) при взаимодействии с автомобилем.
 *
 * */

import com.company.garage.cars.Mercedes;
import com.company.garage.parts.engine.MercedesEngine;
import com.company.garage.parts.engine.NoNameEngine;

public class GarageMainMy {
    public static void main(String[] args) {
        Mercedes mercedes1 = new Mercedes("GL666", new MercedesEngine());
        Mercedes mercedes2 = new Mercedes("GL777", new NoNameEngine());
        System.out.println("Model #1:"+mercedes1.getModel());
        System.out.println("Model #2:"+mercedes2.getModel());

        //MercedesEngine m1_engine= new MercedesEngine();

        //MercedesEngine mm1=new Mercedes();

        //m1_engine.setFuelType(FuelType.DIESEL);

        //System.out.println("Двигатель M1: "+m1_engine.getFuelType());
    }
}
