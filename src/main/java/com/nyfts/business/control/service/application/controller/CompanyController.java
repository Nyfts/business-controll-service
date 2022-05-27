package com.nyfts.business.control.service.application.controller;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.domain.model.Company;
import com.nyfts.business.control.service.domain.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            Company company = companyService.findById(id);
            return ResponseEntity.ok(company);
        } catch (InformationNotFoundException exception) {
            return ResponseEntity.badRequest().body("Information not found!");
        }
    }
}
