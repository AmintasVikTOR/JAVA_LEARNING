package com.company.pckg_computer.api.interfaces.global;

public interface IParts {
    //eCPU cpuStandart(eCPU eCPU);
    //eRAM ramStandart(eRAM ram);
    //eHDD hddStandart(eHDD hdd);

    IStandarts[] getStandart();

    boolean testComputer();
}
