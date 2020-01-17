package com.company.computer;

import com.company.computer.api.enums.eCPU;
import com.company.computer.api.enums.eHDD;
import com.company.computer.api.enums.eRAM;
import com.company.computer.api.interfaces.IParts;

public class Computer  {
    //это отдельный класс, имеющий всего один метод: запуск компьютера
    // при запуске компьютер должен запустить проверку каждой запчасти, находящейся в нем на совместимость и корректность работы
    // совместимость - это подходит данная запчасть в целом для этого компа. Для этого можно ввести enum со списком стандартов.
    // Компьютер должен хранить инфо какие стандарты для него подходят, а запчасти стандарты которым они соответствуют
    // Корректность работы зависит от реализации и по умолчанию всегда запчасть работает корректно, в отдельных реализациях запчасть должна быть бракованной

    IParts [] parts;
    public Computer(IParts [] parts){
        this.parts=parts;
        //конструктор..
    }

    public void runComputer(){
        //реализация метода запуска компьютера
        System.out.println("Компьютер запущен!");

    }

}
