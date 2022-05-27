package com.nyfts.business.control.service.domain.service;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.domain.model.Company;

public interface CompanyService {
    Company findById(Long id) throws InformationNotFoundException;
}
