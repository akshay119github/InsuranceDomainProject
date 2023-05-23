package com.insurance.exceldownload.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.insurance.exceldownload.model.ExcelFile;

public interface ExcelFileService {

	public ExcelFile uploadExcelFile(MultipartFile mFile) throws IOException;
	
	public ExcelFile getFile(Integer id);

}
