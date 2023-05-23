package com.insurance.exceldownload.service.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.insurance.exceldownload.controller.ExcelFileController;
import com.insurance.exceldownload.model.ExcelFile;
import com.insurance.exceldownload.repository.ExcelFileRepository;
import com.insurance.exceldownload.service.ExcelFileService;

@Service
public class ExcelFileServiceImpl implements ExcelFileService {

	@Autowired
	private ExcelFileRepository excelFileRepository;
	
	@Override
	public ExcelFile uploadExcelFile(MultipartFile mFile) throws IOException {
		ExcelFile excelFile = new ExcelFile(mFile.getOriginalFilename(), mFile.getContentType(), mFile.getBytes());
		return excelFileRepository.save(excelFile);
	}

	@Override
	public ExcelFile getFile(Integer id) {
		return excelFileRepository.getFileById(id);
	}
	
	// Logger
	private static final Logger logger = LoggerFactory.getLogger(ExcelFileServiceImpl.class);

}
