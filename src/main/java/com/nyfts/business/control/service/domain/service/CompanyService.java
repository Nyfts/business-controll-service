package com.nyfts.business.control.service.domain.service;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.domain.model.Company;
import com.nyfts.business.control.service.presentation.dto.company.request.CompanyCreateRequestTO;
import com.nyfts.business.control.service.presentation.dto.company.request.CompanyUpdateRequestTO;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    Company findById(Long id);
    Company create(CompanyCreateRequestTO createRequestTO);
    Company update(Long id, CompanyUpdateRequestTO updateRequestTO);
}
