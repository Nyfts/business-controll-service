package com.nyfts.business.control.service.presentation.dto.company;

import com.nyfts.business.control.service.domain.model.Company;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyResponseDTO implements Serializable {

    private Long id;
    private String cnpj;
    private String name;

    public CompanyResponseDTO() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public static CompanyResponseDTO fromCompany(Company company) {
        CompanyResponseDTO companyResponseDTO = new CompanyResponseDTO();

        companyResponseDTO.setId(company.getId());
        companyResponseDTO.setName(company.getName());
        companyResponseDTO.setCnpj(company.getCnpj());

        return companyResponseDTO;
    }

    public static List<CompanyResponseDTO> fromCompanies(List<Company> companies) {
        List<CompanyResponseDTO> companiesResponseDTO = companies.stream().map(company -> fromCompany(company)).collect(Collectors.toList());

        return companiesResponseDTO;
    }

    @Override
    public String toString() {
        return "CompanyResponseDTO{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
