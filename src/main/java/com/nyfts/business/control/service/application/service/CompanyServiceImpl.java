package com.nyfts.business.control.service.application.service;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.domain.model.Company;
import com.nyfts.business.control.service.domain.service.CompanyService;
import com.nyfts.business.control.service.infrastructure.persistence.hibernate.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findById(Long id) {
        Optional<Company> company = companyRepository.findById(id);

        if (company.isEmpty()) {
            throw new InformationNotFoundException();
        }

        return company.get();
    }

    @Override
    public Company create(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company update(Long id, Company company) {
        Company companyToUpdate = findById(id);

        companyToUpdate.setName(company.getName());
        companyToUpdate.setCnpj(company.getCnpj());

        return companyRepository.save(companyToUpdate);
    }
}
