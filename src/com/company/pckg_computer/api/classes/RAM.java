package com.company.pckg_computer.api.classes;

import com.company.pckg_computer.api.interfaces.global.IParts;
import com.company.pckg_computer.api.interfaces.global.IStandarts;

public class RAM implements IParts {
    private IStandarts[] standarts;
    private int ramValue;

    public RAM(IStandarts[] standarts, int ramValue) {
        this.standarts = standarts;
        this.ramValue = ramValue;
    }

    @Override
    public IStandarts[] getStandart() {
        return standarts;
    }

    @Override
    public boolean testComputer() {
        return true;
    }
}
