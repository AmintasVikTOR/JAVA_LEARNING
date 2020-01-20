package com.company.pckg_list;

import java.util.Date;
import java.util.Objects;

public class Passport {
    private String id;
    private Date datePasport;
    private String fio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDatePasport() {
        return datePasport;
    }

    public void setDatePasport(Date datePasport) {
        this.datePasport = datePasport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
