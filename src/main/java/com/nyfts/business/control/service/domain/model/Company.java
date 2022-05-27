package com.nyfts.business.control.service.domain.model;

import com.nyfts.business.control.service.infrastructure.persistence.hibernate.listener.CompanyListener;
import com.nyfts.business.control.service.presentation.dto.company.CompanyRequestDTO;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@EntityListeners(CompanyListener.class)
@Table(name = "t_company", schema = "business")
public class Company implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String cnpj;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime updateDate;

    @Version
    @Column
    private Integer version;

    public Company() { }

    public Company(Long id, String cnpj, String name, LocalDateTime creationDate, LocalDateTime updateDate, Integer version) {
        this.id = id;
        this.cnpj = cnpj;
        this.name = name;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.version = version;
    }

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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public static Company fromRequestDTO(CompanyRequestDTO companyRequestDTO) {
        Company company = new Company();

        company.setName(companyRequestDTO.getName());
        company.setCnpj(companyRequestDTO.getCnpj());

        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", version=" + version +
                '}';
    }
}
