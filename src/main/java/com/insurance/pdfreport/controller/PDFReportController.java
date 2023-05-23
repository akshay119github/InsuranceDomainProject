package com.insurance.pdfreport.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.insurance.pdfreport.model.PDFReport;
import com.insurance.pdfreport.servic.PDFReportService;

@RestController
public class PDFReportController {

	// Inject Service
	@Autowired
	private PDFReportService pdfReportService;

	// Design Rest API to upload PDF into DB
	@PostMapping("/createPdfReport")
	public PDFReport UploadPDF(@RequestParam MultipartFile mFile) throws IOException {
		PDFReport pdfReport = pdfReportService.UploadPDF(mFile);
		return pdfReport;

	}
	
	// Create Object of Logger
		private static final Logger logger = LoggerFactory.getLogger(PDFReportController.class);

}
