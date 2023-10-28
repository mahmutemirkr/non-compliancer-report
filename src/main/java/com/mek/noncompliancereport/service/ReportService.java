package com.mek.noncompliancereport.service;

import com.mek.noncompliancereport.domain.Report;
import com.mek.noncompliancereport.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    public final ReportRepository reportRepository;


    public ReportService(ReportRepository reportRepository) {

        this.reportRepository = reportRepository;

    }

    public void save(Report report) {

        reportRepository.save(report);

    }


}
