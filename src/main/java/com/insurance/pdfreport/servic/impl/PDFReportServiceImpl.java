package com.insurance.pdfreport.servic.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.insurance.pdfreport.model.PDFReport;
import com.insurance.pdfreport.repository.PDFReportRepository;
import com.insurance.pdfreport.servic.PDFReportService;

@Service
public class PDFReportServiceImpl implements PDFReportService {

	// Inject Repository
	@Autowired
	private PDFReportRepository pdfReportRepository;

	@Override
	public PDFReport UploadPDF(MultipartFile mFile) throws IOException {
		// Pass data through using constructor
		PDFReport pdfReport = new PDFReport(mFile.getOriginalFilename(), mFile.getContentType(), mFile.getBytes());

		PDFReport pdfReport2 = pdfReportRepository.save(pdfReport);

		return pdfReport2;
	}
	
	// Create Object of Logger
		private static final Logger logger = LoggerFactory.getLogger(PDFReportServiceImpl.class);

}
