package com.company.computer.api;

import com.company.computer.api.enums.eCPU;
import com.company.computer.api.interfaces.IParts;

public abstract class CPU implements IParts {
    eCPU cpu;
    @Override
    public eCPU cpuStandart(eCPU cpu) {
        return this.cpu=cpu;
    }
}
