package com.nyfts.business.control.service.infrastructure.persistence.hibernate.repository;

import com.nyfts.business.control.service.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
