package com.nyfts.business.control.service.infrastructure.persistence.hibernate.listener;

import com.nyfts.business.control.service.domain.model.Company;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class CompanyListener {

    @PrePersist
    public void auditPersist(Company company) {
        company.setCreationDate(LocalDateTime.now());
    }

    @PreUpdate
    public void auditUpdate(Company company) {
        company.setUpdateDate(LocalDateTime.now());
    }
}
