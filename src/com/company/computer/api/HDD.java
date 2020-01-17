package com.company.computer.api;

import com.company.computer.api.enums.eHDD;
import com.company.computer.api.interfaces.IParts;

public abstract class HDD implements IParts {
    eHDD hdd;
    @Override
    public eHDD hddStandart(eHDD hdd) {
        return this.hdd=hdd;
    }
}
