package com.nyfts.business.control.service.domain.service;

import com.nyfts.business.control.service.domain.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    Company findById(Long id);
    Company create(Company company);
    Company update(Long id, Company company);
}
