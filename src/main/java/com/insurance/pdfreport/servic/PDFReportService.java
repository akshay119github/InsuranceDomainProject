package com.insurance.pdfreport.servic;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.insurance.pdfreport.model.PDFReport;

public interface PDFReportService {

	public PDFReport UploadPDF(MultipartFile mFile) throws IOException;

}
