package com.insurance.pdfreport.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.pdfreport.model.PDFReport;

@Repository
public interface PDFReportRepository extends CrudRepository<PDFReport, Integer> {

}
