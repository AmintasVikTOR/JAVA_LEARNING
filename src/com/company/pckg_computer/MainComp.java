package com.company.pckg_computer;

import com.company.pckg_computer.api.classes.CPU;
import com.company.pckg_computer.api.classes.HDD;
import com.company.pckg_computer.api.classes.RAM;
import com.company.pckg_computer.api.enums.eCPU;
import com.company.pckg_computer.api.enums.eHDD;
import com.company.pckg_computer.api.enums.eRAM;
import com.company.pckg_computer.api.interfaces.global.IParts;
import com.company.pckg_computer.api.interfaces.global.IStandarts;

public class MainComp {
    public static void main(String[] args) {
        IParts[] parts = new IParts[]{
                new CPU(new IStandarts[]{eCPU.ATHLON}, 2300),
                new HDD(new IStandarts[]{eHDD.SATA}, 500),
                new RAM(new IStandarts[]{eRAM.DDR3}, 8096),
        };

        Computer myComp=new Computer(parts, new IStandarts[] {
//                eCPU.ATHLON,
//                eHDD.SSD,
//                eRAM.DDR3
                eCPU.ATHLON,
                eHDD.SATA,
                eRAM.DDR3
        });

         if (myComp.runComputer())
             System.out.println("RUNNING!");

    }
}