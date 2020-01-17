package com.company.computer.api.interfaces;

import com.company.computer.api.enums.eCPU;
import com.company.computer.api.enums.eHDD;
import com.company.computer.api.enums.eRAM;

public interface IParts {
    eCPU cpuStandart(eCPU eCPU);
    eRAM ramStandart(eRAM ram);
    eHDD hddStandart(eHDD hdd);
}
