package com.company.pckg_computer.api.classes;

import com.company.pckg_computer.api.interfaces.global.IParts;
import com.company.pckg_computer.api.interfaces.global.IStandarts;

public class HDD implements IParts {

    private IStandarts[] standarts;
    private int hddValue;

    public HDD(IStandarts[] standarts, int hddValue) {
        this.standarts = standarts;
        this.hddValue = hddValue;
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
