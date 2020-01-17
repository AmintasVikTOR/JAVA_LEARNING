package com.company.computer.api;

import com.company.computer.api.enums.eRAM;
import com.company.computer.api.interfaces.IParts;

public abstract class RAM implements IParts {
    eRAM ram;
    @Override
    public eRAM ramStandart(eRAM ram) {
        return this.ram=ram;
    }
}
