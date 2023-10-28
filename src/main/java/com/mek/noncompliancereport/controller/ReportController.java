package com.mek.noncompliancereport.controller;

import com.mek.noncompliancereport.domain.Report;
import com.mek.noncompliancereport.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class ReportController {

    @Autowired
    public final ReportService reportService;

    public ReportController(ReportService reportService) {

        this.reportService = reportService;

    }


    @GetMapping("/report-register")
    public String bookRegister() {

        return "reportRegister";

    }

    @PostMapping("/report-register")
    public String addReport(@ModelAttribute Report report, BindingResult bindingResult) {


        if(bindingResult.hasErrors()){

            return "reportRegister";
        }

        reportService.save(report);

        return "redirect:/report-register";

    }



}
