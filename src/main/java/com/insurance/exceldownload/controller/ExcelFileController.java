package com.insurance.exceldownload.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.insurance.exceldownload.model.ExcelFile;
import com.insurance.exceldownload.service.ExcelFileService;

@RestController
public class ExcelFileController {
	
	@Autowired
	private ExcelFileService excelFileService;
	
	// Design API to upload Excel File
	@PostMapping("/uploadExcelFile")
	public ExcelFile uploadExcelFile(@RequestParam MultipartFile mFile) throws IOException {
		return excelFileService.uploadExcelFile(mFile);
	}
	
	// Design API to download Excel File
	@GetMapping("/getExcelFile/{id}")
	public ExcelFile getFile(@PathVariable Integer id) {
		return excelFileService.getFile(id);
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(ExcelFileController.class);

}
