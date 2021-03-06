package com.nyfts.business.control.service.application.controller;

import com.nyfts.business.control.service.domain.model.Company;
import com.nyfts.business.control.service.domain.service.CompanyService;
import com.nyfts.business.control.service.presentation.dto.company.CompanyRequestDTO;
import com.nyfts.business.control.service.presentation.dto.company.CompanyResponseDTO;
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
    public ResponseEntity<List<CompanyResponseDTO>> findAll() {
        return ResponseEntity.ok(CompanyResponseDTO.fromCompanies(companyService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Company company = companyService.findById(id);
        return ResponseEntity.ok(ResponseEntity.ok(CompanyResponseDTO.fromCompany(company)));
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompanyRequestDTO requestDTO) {
        Company company = Company.fromRequestDTO(requestDTO);
        Company savedCompany = companyService.create(company);
        return ResponseEntity.ok(CompanyResponseDTO.fromCompany(savedCompany));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CompanyRequestDTO requestDTO) {
        Company company= Company.fromRequestDTO(requestDTO);
        Company updatedCompany = companyService.update(id, company);
        return ResponseEntity.ok(CompanyResponseDTO.fromCompany(updatedCompany));
    }
}
