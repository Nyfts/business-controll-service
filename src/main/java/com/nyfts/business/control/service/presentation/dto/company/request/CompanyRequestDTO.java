package com.nyfts.business.control.service.presentation.dto.company.request;

import java.io.Serializable;

public class CompanyRequestDTO implements Serializable {

    private String cnpj;
    private String name;

    public CompanyRequestDTO() { }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CompanyRequestDTO{" +
                "cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
