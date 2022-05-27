package com.nyfts.business.control.service.application.controller;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.domain.model.Company;
import com.nyfts.business.control.service.domain.service.CompanyService;
import com.nyfts.business.control.service.presentation.dto.company.request.CompanyCreateRequestTO;
import com.nyfts.business.control.service.presentation.dto.company.request.CompanyUpdateRequestTO;
import com.nyfts.business.control.service.presentation.dto.shared.ErrorResponseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public ResponseEntity<List<Company>> findAll() {
        return ResponseEntity.ok(companyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Company company = companyService.findById(id);
        return ResponseEntity.ok(company);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompanyCreateRequestTO createRequestTO) {
        Company company = companyService.create(createRequestTO);
        return ResponseEntity.ok(company);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CompanyUpdateRequestTO updateRequestTO) {
        Company company = companyService.update(id, updateRequestTO);
        return ResponseEntity.ok(company);
    }
}
