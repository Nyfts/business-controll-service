package com.nyfts.business.control.service.application.service;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.domain.model.Company;
import com.nyfts.business.control.service.domain.service.CompanyService;
import com.nyfts.business.control.service.infrastructure.persistence.hibernate.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company findById(Long id) throws InformationNotFoundException {
        Optional<Company> company = companyRepository.findById(id);

        if (company.isEmpty()) {
            throw new InformationNotFoundException();
        }

        return company.get();
    }
}
