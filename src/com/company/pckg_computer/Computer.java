package com.company.pckg_computer;

import com.company.pckg_computer.api.interfaces.global.IParts;
import com.company.pckg_computer.api.interfaces.global.IStandarts;

public class Computer  {
    //это отдельный класс, имеющий всего один метод: запуск компьютера
    // при запуске компьютер должен запустить проверку каждой запчасти, находящейся в нем на совместимость и корректность работы
    // совместимость - это подходит данная запчасть в целом для этого компа. Для этого можно ввести enum со списком стандартов.
    // Компьютер должен хранить инфо какие стандарты для него подходят, а запчасти стандарты которым они соответствуют
    // Корректность работы зависит от реализации и по умолчанию всегда запчасть работает корректно, в отдельных реализациях запчасть должна быть бракованной

    private IParts [] parts;
    private IStandarts[] standards;

    //constructor..
    public Computer(IParts [] parts, IStandarts[] standarts){
        this.parts=parts;
        this.standards=standarts;
    }
    public boolean runComputer(){
        //реализация метода запуска компьютера
        boolean result = true;
        for (IParts part : parts) {
            for (IStandarts standart : standards) {
                System.out.println("STANDART: "+standart);
                System.out.println("PART: "+part);
                if(standart == part ){
                    System.out.println("All OK!!!");
                }
            }
        }
        return result;
    }
}
