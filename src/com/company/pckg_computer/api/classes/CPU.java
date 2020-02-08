package com.company.pckg_computer.api.classes;

import com.company.pckg_computer.api.interfaces.global.IStandarts;
import com.company.pckg_computer.api.interfaces.personal.ICPU;

public class CPU implements ICPU {
    private IStandarts[] standarts;
    private int chastota;

    public CPU(IStandarts[] standartss, int chastota) {
        this.standarts = standarts;
        this.chastota = chastota;
    }

    @Override
    public IStandarts[] getStandart() {
        return this.standarts;
    }

    @Override
    public boolean testComputer() {
        return true;
    }
}
