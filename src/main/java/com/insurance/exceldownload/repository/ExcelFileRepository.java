package com.insurance.exceldownload.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.exceldownload.model.ExcelFile;

@Repository
public interface ExcelFileRepository extends CrudRepository<ExcelFile, Integer> {
	
	public ExcelFile getFileById(Integer id);

}
